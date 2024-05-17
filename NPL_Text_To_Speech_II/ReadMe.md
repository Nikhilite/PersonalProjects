# EXPLORATION_ACTIVITY_2
## README

### Package/Library:
**'pyttsx3'** : This library is used for text-to-speech conversion inPython. In the  code, pyttsx3 id initialized as a text-to-speech engine, and it converts the user input and named entities into speech.

`import pyttsx3`
`engine = pyttsx3.init()`

### How to run the Code?

**1. Install the required libraries:**
- Make sure to install python in the system.
- install the required libraries using the following commands in the terminal or command prompt:

`pip install spacy`
`pip install pyttsx3`

**2. Download the spaCy English model:**
- Download the spaCy English model by running the following command in the terminal or command prompt:

`python -m spacy download en_core_web_sm`

**3. Run the Program:**
- Download the script and save it in your PC.
- Run the script using the following command:
`python npl_text_speech.py`

*The output contains audible parts -- kindly turn up the volume to listen.*

### Purpose of the program

The provided program serves as a simple example of natural language processing (NLP) using spaCy library and text-to-speech (TTS) conversion using the pyttsx3 library.

**1. Text-to-speech(TTS) Conversion:**
- The program uses the pyttsx3 library to convert specific  information into speech.
- It takes the user input and the identified named entities and cnverts them into a spoken output.

**2. User Interaction:**
- The program prompts the user to enter a sentence for analysis.
- It then displays the tokenization, part-of-speech tags, and named entities in the console.
- Finally, it converts the user input and named entities into speech, providing an audible output.

**In short**
This program is a basic demonstration of how to use NLP  techniques to analyze text and how to convert specific information into speech using TTS. It can be a starting point for more complex applications involving natural language understanding and spoken interactions.

### Sample Input/Output

**Sample Input:**
>Enter a sentence: The quick brown fox jumps over the lazy dog. UTCS AI-Lab is an artificial intelligence research lab.

**Sample Output(TEXT):**



![alt text](https://github.com/CS2613-FA23/explorationactivity2-Nikhilite/blob/main/Output/TEXT.png)

**Sample Output(Speech):**
> User input: The quick brown fox jumps over the lazy dog. OpenAI is an artificial intelligence research lab. Named Entities: OpenAI: ORG.

***This is an audible output --kindly turn the volume up to listen***

### References
[1]https://spacy.io/usage
[2]https://pyttsx3.readthedocs.io/en/latest/


# END