# OVERVIEW

### Package/Library

1. **pyttsx3**: This library is used for text-to-speech (TTS) conversion. The code initializes the pyttsx3 engine and utilizes it to convert specific information into speech.

#### Purpose:

**pyttsx3** is a Python library that provides a simple and cross-platform text-to-speech (TTS) conversion. Its primary purpose is to allow developers to incorporate speech synthesis capabilities into their Python applications. This library is built on top of different TTS engines, providing a unified interface for users to convert text into spoken words.

#### How to Use:

1. **Installation:**
- **pyttsx3** can be installed using the following command:
`pip install pyttsx3`

2. **Initialization:**
- can be done using the following command:
`import pyttsx3`
`engine = pyttsx3.init()`

3. **Setting Properties:**
- we can set various properties of the speech engine, such as the rate (speed) and volume.

>Set speech rate (speed)
`engine.setProperty('rate', 150)`

>Set volume (0.0 to 1.0)
`engine.setProperty('volume', 0.9)`

4. **Converting Text to Speech:**
- The main functionality of pyttsx3 is to convert text into speech. We can use the say() method for this purpose.

>Convert text to speech
`engine.say("Hello, this is pyttsx3 speaking!")`

5. **Running and Waiting:**
- After setting the text, we need to call runAndWait() to make the engine process the speech.

> Run and wait for the speech to finish
`engine.runAndWait()`

#### **Additional Features:**

1. **Event Handling:**

**pyttsx3** provides event handling capabilities, allowing you to bind functions to events like the start and end of speech.

```
def onStart(name):
    print('Starting:', name)

def onEnd(name, completed):
    print('Finished:', name, completed)

engine.connect('started-utterance', onStart)
engine.connect('finished-utterance', onEnd)
```
2. **Supported TTS Engines:**

**pyttsx3** supports different TTS engines, and can switch between them. The default is the sapi5 engine on Windows, but we can use other engines like espeak or nsss on macOS.

> Change the TTS engine
`engine = pyttsx3.init(driverName='espeak')`

### Creation

**pyttsx3** is a Python library for text-to-speech conversion that is built on top of different TTS engines. It was created in the month of January, 2022. **pyttsx3** is a continuation of the pyttsx library, and pyttsx3 specifically addresses some issues and limitations present in the earlier version. The development and maintenance of pyttsx3 have been ongoing, with contributions from the open-source community.

### Reason for the Selection

1. **Simplicity and Ease of Use:**

**pyttsx3** is known for its simplicity and ease of integration. It provides a straightforward API for text-to-speech conversion, making it accessible for users who want a quick and easy way to add speech synthesis to their Python applications.

2. **Cross-Platform Compatibility:**

**pyttsx3** is designed to work across different platforms, including Windows, macOS, and Linux. This cross-platform compatibility ensures that the code can be easily run on various operating systems without major modifications.

3. **Versatility:**

The library supports multiple TTS engines, allowing users to choose different backends according to their preferences. This versatility provides flexibility for developers who may have specific requirements or preferences for the underlying speech synthesis engine.

4. **No External Dependencies:**

**pyttsx3** does not have external dependencies beyond the standard libraries, which simplifies the installation process. This makes it convenient for users who want a lightweight solution without the need for additional dependencies.

### Influence:

1. **Practical Application of Concepts:**

Learning and using a library like **pyttsx3** provides practical application of programming concepts. It allows learners to see how to incorporate external functionality into their Python programs, reinforcing concepts like module usage, function calls, and API interactions.

2. **Expanding Toolset and Versatility:**

Learning and using different libraries expands a learner's toolkit, providing them with versatile solutions for a range of tasks. It encourages learners to explore various libraries and choose the most suitable ones for their specific projects.


### Overall Experience

The decision to continue using **pyttsx3** depends on the specific needs of the project and the user's preferences. For simple applications or scenarios where quick and easy text-to-speech functionality is required, **pyttsx3** can be a suitable choice. However, for projects with more advanced requirements, developers can explore other TTS solutions with additional features and capabilities.

### References
[1] https://pyttsx3.readthedocs.io/en/latest/
[2] https://github.com/nateshmbhat/pyttsx3

# END