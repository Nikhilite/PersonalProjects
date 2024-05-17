import spacy

#Loading the english language model.
nlp = spacy.load("en_core_web_sm")

#User Input
text = input("Enter a setence: ")

#Processing the text using spaCy
doc = nlp(text)

#Tokenization
print("Tokens:")
for token in  doc:
    print(token.text)

#Part-of-speech tagging
print("\nPart-of-Speech Tags:")
for token in doc:
    print(f"{token.text}: {token.pos_}")

#Named Entity Recognition
print("\nNamed Entities:")
for ent in doc.ents:
    print(f"{ent.text}: {ent.label_}")