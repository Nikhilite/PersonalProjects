import pandas as pd
import matplotlib.pyplot as plt


df=pd.read_csv("F:\\Python programs\\IP Project\\Covid19.csv",index_col=0)

cov=pd.DataFrame(df,columns=["Total_Cases","Daily_Cases","Active_Cases","Total_Death","Recovories"])

ch='y'
while ch=='y'or ch=='Y':
    print("Main Menu")
    print("1.Covid19 Case Deatails")
    print("2.View Records")
    print("3.Graphical comparison of cases")
    print("4.Highest and lowest number of cases reported")
    print("5.Exit")
    
    ch1=int(input("Enter your choice:"))
    if ch1==1:
            print("DISPLAYING DAILY SPIKES IN COVID CASES IN THE MONTH OF MARCH,APRIL AND MAY 2021")
            print("=============================")
            print(cov)
            
    elif ch1==2:
        while(True):
            print("View Records Menu")
            print("1.Display 5 records from March 1st")
            print("2.Display 5 records before May 31st")
            print("3.Specific number of records from March 1st")
            print("4.Specific number of records before May 31st")
            print("5.Exit")
            
            ch3=int(input("Enter Choice:"))
                    
            if ch3==1:
                print(cov.head())
            elif ch3==2:
                print(cov.tail())
            elif ch3==3:
                n=int(input("Enter how many records you want to display from March 1st:"))
                print(cov.head(n))
            elif ch3==4:
                n=int(input("Enter how many records you want to display before May 31st:"))
                print(cov.tail(n))
            elif ch3==5:
                break
            
    elif ch1==3:
        while(True):
            print("Graphs Menu")
            print("1.No. of active cases")
            print("2.No. of confirmed cases")
            print("3.No.of deaths")
            print("4.Exit")

            ch5=int(input("Enter Choice:"))

            if ch5==1:
                x=cov.index
                y=cov['Active_Cases']
                plt.plot(x,y)

                plt.title("No.of active cases")
                plt.xlabel("Date")
                plt.ylabel("Active Cases")
                plt.show()
            elif ch5==2:
                plt.barh(cov.index,cov.Total_Cases)
                plt.title("No.of confirmed cases")
                plt.xlabel("Confirmed Cases")
                plt.ylabel("Date")
                plt.show()
            elif ch5==3:
                plt.bar(cov.index,cov.Total_Death)
                plt.title("No.of Deaths")
                plt.xlabel("Date")
                plt.ylabel("Deaths")
                plt.show()
            elif ch5==4:
                break
    elif ch1==5:
        while(True):
            print("Case report Menu")
            print("1.Date on which highest number of active cases were reported")
            print("2.Date on which lowest number of active cases were reported")
            print("3.Date on which highest number of recovered cases were reported")
            print("4.Date on which lowest number of  recovered cases were reported")
            print("5.Date on which highest number of confirmed cases were reported")
            print("6.Date on which lowest number of  confirmed cases were reported")
            print("7.Date on which highest number of deaths were reported")
            print("8.Date on which lowest number of deaths were reported")
            print("9.Exit")

            ch6=int(input("Enter Choice:"))

            if ch6==1:
                m=cov['Active_Cases'].max()
                s=cov.loc[cov.Active_Cases==m]
                print("Date on which highest number of active cases were reported--",m,"is\n",s.index)
            elif ch6==2:
                m=cov['Active_Cases'].min()
                s=cov.loc[cov.Active_Cases==m]
                print("Date on which lowest number of active cases were reported--",m,"is\n",s.index)
            elif ch6==3:
                m=cov['Recovories'].max()
                s=cov.loc[cov.Recovories==m]
                print("Date on which highest number of recovered cases were reported--",m,"is\n",s.index)
            elif ch6==4:
                m=cov['Recovories'].min()
                s=cov.loc[cov.Recovories==m]
                print("Date on which lowest number of  recovered cases were reported--",m,"is\n",s.index)
            elif ch6==5:
                m=cov['Total_Cases'].max()
                s=cov.loc[cov.Total_Cases==m]
                print("Date on which highest number of confirmed cases were reported--",m,"is\n",s.index)
            elif ch6==6:
                m=cov['Total_Cases'].min()
                s=cov.loc[cov.Total_Cases==m]
                print("Date on which lowest number of  confirmed cases were reported--",m,"is\n",s.index)
            elif ch6==7:
                m=cov['Total_Death'].max()
                s=cov.loc[cov.Total_Death==m]
                print("Date on which highest number of deaths were reported--",m,"is\n",s.index)
            elif ch6==8:
                m=cov['Total_Death'].min()
                s=cov.loc[cov.Total_Death==m]
                print("Date on which lowest number of deaths were reported--",m,"is\n",s.index)
            elif ch6==9:
                break
    elif ch1==6:
        break
