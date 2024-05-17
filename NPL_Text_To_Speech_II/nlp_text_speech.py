import spacy
import pyttsx3

# Loading the English language model.
nlp = spacy.load("en_core_web_sm")

# Initialize the text-to-speech engine.
engine = pyttsx3.init()

# User Input
text = input("Enter a sentence: ")

# Processing the text using spaCy
doc = nlp(text)

# Tokenization
print("Tokens:")
for token in doc:
    print(token.text)

# Part-of-speech tagging
print("\nPart-of-Speech Tags:")
for token in doc:
    print(f"{token.text}: {token.pos_}")

# Named Entity Recognition
print("\nNamed Entities:")
for ent in doc.ents:
    print(f"{ent.text}: {ent.label_}")

# Convert user input and named entities into speech
speech_text = f"User input: {text}. Named Entities: {' '.join([f'{ent.text}: {ent.label_}' for ent in doc.ents])}."
engine.say(speech_text)
engine.runAndWait()
