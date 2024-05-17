**EXPLORATION ACTIVITY 1**


**README**

Demonstration:
The spaCy library is used in the example program to show how to process natural language. Tokenization, part-ofspeech tagging, named entity recognition, and other NLP activities are all carried out using the well-linked and potent Python module SpaCy. SpaCy is used in the example program to process tasks like tokenization, part-of speech tagging and named entity recognition on it.

Steps to run the program:
1) Install spaCy and Download Language Model:
   Open the terminal or command prompt and execute the following commands:
     --> python -m pip install spacy
     --> python -m spacydownload en_core_web_sm

     These commands will install spaCy and download the English language model.

2) Download the python script provided 
   => EXA1.py

3) Run the python script:
   Run the python script using the Python interpreter. This can be done by opening the terminal or command prompt and navigating to the directory where the script is located. Then, type in the following command:
   --> python EXA1.py

4) Enter User Input:
   When the script is runing, it will prompt to enter a sentence. Type in the sentence you want to analyse and press enter.

Purpose:
This program demonstrates how these fundamental NLP operations on user-provided text can be carried out using spaCy. It is frequently utilized as a jumping-off point for individuals learning about spaCy and NLP or as a reference for integrating NLP capability into more complex applications, including chatbots, sentiment analysis, or information extration.

Sample Input/Output:
1) 
Enter a setence: Hi, my name is Nikhil Shibu.
Tokens:
Hi
,
my
name
is
Nikhil
Shibu
.

Part-of-Speech Tags:
Hi: PROPN
,: PUNCT
my: PRON
name: NOUN
is: AUX
Nikhil: PROPN
Shibu: PROPN
.: PUNCT

Named Entities:
Nikhil Shibu: PERSON

Screenshots:
![Alt text](Ouputs/ouput1.png)

2) 
Enter a setence: Apple Inc. was founded by Steve Jobs, Steve Wozniak, and Ronald Wayne in Cupertino, California.
Tokens:
Apple
Inc.
was
founded
by
Steve
Jobs
,
Steve
Wozniak
,
and
Ronald
Wayne
in
Cupertino
,
California
.

Part-of-Speech Tags:
Apple: PROPN
Inc.: PROPN
was: AUX
founded: VERB
by: ADP
Steve: PROPN
Jobs: PROPN
,: PUNCT
Steve: PROPN
Wozniak: PROPN
,: PUNCT
and: CCONJ
Ronald: PROPN
Wayne: PROPN
in: ADP
Cupertino: PROPN
,: PUNCT
California: PROPN
.: PUNCT

Named Entities:
Apple Inc.: ORG
Steve Jobs: PERSON
Steve Wozniak: PERSON
Ronald Wayne: PERSON
Cupertino: GPE
California: GPE

Screenshots:
![Alt text](Ouputs/output2(2).png)
![Alt text](Ouputs/output2(1).png)

3) 
Enter a setence: SpaCy is a powerful NLP library.
Tokens:
SpaCy
is
a
powerful
NLP
library
.

Part-of-Speech Tags:
SpaCy: PROPN
is: AUX
a: DET
powerful: ADJ
NLP: PROPN
library: NOUN
.: PUNCT

Named Entities:
NLP: ORG

Screenshots:
![Alt text](Ouputs/output3.png)

4) 
Enter a setence: The quick brown fox jumped over the lazy dog near a river.
Tokens:
The
quick
brown
fox
jumped
over
the
lazy
dog
near
a
river
.

Part-of-Speech Tags:
The: DET
quick: ADJ
brown: ADJ
fox: NOUN
jumped: VERB
over: ADP
the: DET
lazy: ADJ
dog: NOUN
near: ADP
a: DET
river: NOUN
.: PUNCT

Named Entities:

Screenshots:
![Alt text](Ouputs/output4.png)

References:
[1]https://spacy.io/
[2]https://spacy.io/usage
[3]https://spacy.io/models
[4]https://github.com/explosion/spaCy
[5]https://spacy.io/usage/examples


**END**