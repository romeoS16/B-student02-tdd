# PROMPT_LOG

**Beispiel:**  

[Aufgabe xxx]  
[2025-11-22 10:27]  
Prompt: "Implementiere isPalindrome(String) mit Ignorieren von Leerzeichen."  
-> Code übernommen, aber für null angepasst.

[2025-11-22 10:35]  
Prompt: KI nach Randfalltests gefragt.  
-> 1 Test übernommen, 1 verworfen.   

---
[Aufgabe 1]
Prompt 1.1: "Ich habe folgende Unit-Tests und brauche eine Implementierung in Java. (copy-paste der Unit-Tests)"
-> Code übernommen

Prompt 1.2: "Zwei Tests wurden ergänzt (copy-paste Unit-Tests)"
-> Fehler in Antwort erkannt --> neue Prompt

Prompt 1.3 "Nein, am besten ein leeres String-Array"
-> neuen Code übernommen

[Aufgabe 2]
Prompt 2.1: "Ich habe weitere Unit-Tests und brauche die zugehörige Implementierung (copy-paste der Unit-Tests)"
-> Code übernommen

[Aufgabe 3]
Prompt 3.1: "Habe weitere Unit-Tests. Gib mir die Implementierung (copy-paste Unit-Tests)"
-> Neue Prompt, weil KI die Punktevergabe nicht kannte
Prompt 3.2: "(copy-paste aus Aufgabestellung)"
-> Code übernommen 

