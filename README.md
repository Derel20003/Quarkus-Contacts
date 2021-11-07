# Übung 1 - Dokumentation (Quarkus-Contacts)

In diesem Projekt wird mit Quarkus und CDI gearbeitet. Hier werden Besipielsweise zwei Namenslisten-Services zur verfügung gestellt.

## Lösungsweg

1. Aufsetzen des Projektes
2. Implementierung aller Klassen und deren Funktionen
3. Testen des Services
4. Version-Control über GitHub
5. Dokumentieren des Projektes

> ### Class Namelist
> * tryAction(String action, String name, String newName)
> 
>   Hauptmethode beider Klassen. Hier bestimmt der Parameter "atcion" ob ein Name der Liste hinzugefügt, verändert oder gelöscht wird.


> ### Class SavableNamelist
> * tryAction(String action, String name, String newName)
> 
>   Hauptmethode beider Klassen. Hier bestimmt der Parameter "atcion" ob ein Name der Liste hinzugefügt, verändert oder gelöscht wird. Wichtiger (und einziger) Unterschied zur "Namelist" Klasse ist das statt In-Memory Liste ein gespeichertes File verwendet wird.

Nach kompilieren und durchlaufen der Tests kann mann den Service unter http://localhost:8080/contacts/{namelistType} erreichen.

## Tests

Alle implementierten Test laufen automatisch beim Start des Services durch. Sie sind außerdem in diesem Projekt unter **src/tests/java/contacts.com/** zu finden. 

## Probleme

Die erste Reihe der Probleme bestand darin, dass in dem file **pom.xml** die Plugins 
```xml
<maven.home>${maven.home}</maven.home
```
```xml
<artifactId>maven-failsafe-plugin</artifactId>
```
sowie dessen zugehörige Version
```xml
<version>${surefire-plugin.version}</version>
```
nicht erkannt werden. Dies ist sehr wahrscheinlich ein weiterer Fehler in der Reihe von Fehlern, die ich beim Aufsetzen der VM gemacht (oder auch nicht gemacht) habe. Aber bisher hat sich mir keine Lösung ergeben. 

Weiters hatte ich Probleme zu verstehen, wie man eine qualifizierte Dependency-Injection implementiert bzw. wozu das in diesem Fall nützlich wäre (außer zu demonstrativen Zwecken). Deshalb habe ich die **SavableNamelist-Klasse**, genau so wie die erste **Namelist-Klasse** über simple Dependency-Injection zur Verfügung gestellt. Natürlich ist mir ein Punkteabzug in diesem Sinne klar, aber würde trotzdem gerne wissen wie ich dies richtig umsetzen hätte können.

