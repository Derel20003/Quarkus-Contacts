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
nicht erkannt werden. Dies ist sehr wahrscheinlich ein weiterer Fehler in der Reihe von Fehlern, die ich beim Aufsetzen der VM (oder auch nicht) gemacht habe. Aber bisher hat sich mir keine Lösung ergeben.
