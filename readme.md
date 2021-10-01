------------------------------------------------------------------------


1 - REFLECTIONS

------------------------------------------------------------------------

1.1 - Computer mouse 

Identify the types of testing you would perform on a computer mouse, 
to make sure that it is of the highest quality.

SVAR:

Under forudsætning af at denne mus er en ny type, som skal masse produceres, og at jeg er ansat
i en virksomhed som skal sørge for at sikre kvaliteten, ville jeg gøre følgende:

Holdbarhed:
- Fald fra min. 1 meters højde nogle gange for at sikre holdbarheden.
- Slå på den med et hårdt objekt for at sikre holdbarheden. 
- Lægge den under tryk mellem to objekter for at sikre holdbarheden.

Præcision/Forsinkelse:
- Bruge maleprogram for at undersøge musens præcision samt forsinkelse.
- Spille et skydespil for at undersøge musens præcision samt forsinkelse.

Kompatibilitet:
- Sætte musen til en række forskellige enheder/styresystemer, for at sikre kompatibiliteten.
Fx. Linux/Mac/Windows og forskellige mærker såsom (Dell, Asus, Acer, Mac, osv.)

Ergonomisk:
- For at sikre at musen er god at holde på, ville jeg samtidig sørge for at få en række forskellige
personer - med forskellige størrelse hænder - til at teste hvordan musen ligger i hånden.

--------------------------------------------------------------------------

1.2 - Catastrophic failure 

Find a story where a software system defect had a bad outcome. 
Describe what happened. 
Can you identify a test that would have prevented it? 

SVAR:

SOFTWARE FEJL I MERCEDES-BENZ BILER

En fejl i mercedes-benz bilers software, resulterer i at bilejere i en ulykke kan sende en forkert
lokation gennem deres "eCall" software, som skal kunne sende lokationen på bilen ved en ulykke.
Dette kan resultere i at en ambulance bliver sendt til en forkert lokation - som i yderste tilfælde
kan risikere at koste menneskeliv.
Fejlen som påvirker over 1.2 millioner Mercedes-Benz biler, tvinger firmaet til at lave en hurtig og
akut softwareopdatering som skal opdateres på samtlige af de påvirkede biler hurtigst muligt.

https://www.version2.dk/artikel/softwarefejl-hos-mercedes-benz-rammer-12-millioner-biler-usa-1092113

LØSNING:

Det er tydeligt at der har manglet at blive testet på dette "eCall" system. 
Det er dog svært at sige præcis hvilke tests der ikke er blevet gennemført, da virksomheden har været
temmelig hemmelighedsfulde omkring den præcise årsag til denne fejl lokalisering i enheden.

Det er klart at man skal sørge for at lave en unit test på selve enheden, og derudover også teste selve
integrationen med resten af softwaren gennem en integrations test.
Derudover ville en end-to-end test kunne tjekke hele softwaren igennem mht. denne lokalisations funktion
hvilket muligvis også kunne have undgået at denne "bug" ville kunne slippe igennem uden at blive opdaget.

--------------------------------------------------------------------------

2 - TWO KATAS 

Complete the following using TDD. 
Remember the TDD mantra.

--------------------------------------------------------------------------

2.1 - String utility

Use TDD to create a string utility with the following methods:

• Reverse string (aBc -> cBa)
• Capitalize string (aBc -> ABC)
• Lowercase string (aBc -> abc)

SVAR:

Tjek de medfølgende filer.

--------------------------------------------------------------------------

2.2 - Bowling game kata 

Complete the Bowling Game Kata using TDD. 

SVAR:

Tjek de medfølgende filer.

--------------------------------------------------------------------------

3 - INVESTIGATION OF TOOLS 

--------------------------------------------------------------------------

3.1 - JUnit 5 

Investigate JUnit 5 (Jupiter). 
Explain the following, and how they are useful. 

• @Tag 

Bruges til at kunne filtrere tests, hvis man vil køre en række klasse
eller metode tests afhængig af det man vil teste - hvor der måske er en række
klasser som hænger sammen - eller i modsatte tilfælde hvor man kun vil 
køre nogle enkelte metode tests i en klasse.

• @Disabled 

Bruges til at deaktivere en klasse eller metode test.
Kunne være brugbart hvis man har nogle deaktiverede funktion i et program
som man senere gerne vil benytte.

• @RepeatedTest 

En måde at køre den samme test et bestemt antal gange.
Kan være nyttig hvis man har en test, hvor man har nogle parametre som kan
variere fra gang til gang.

• @BeforeEach, @AfterEach 

En annotation til at markerer at en metode skal køre før eller efter en given
test.
Kan bruges til at ændre noget data som en test er afhængig af.

• @BeforeAll, @AfterAll 

Som overstående, bare hvor man kun annoterer at denne metode skal køres en 
enkelt gang, hvorimod den overstående @BeforeEach/@AfterEach bliver kørt hver
gang.

• @DisplayName 

En annotation som giver mulighed for at give test metoden et bestemt navn, så
man nemmere kan finde den eller bedre kan forklare præcis hvad testen gør.

• @Nested 

Annoterer at denne testklasse er en ikke statisk indlejret klasse.
Giver mulighed for at have en eller flere indre klasser i en klasse, som 
dermed vil have samme initialisering som hovedklassen.

• assumeFalse, assumeTrue 

Giver mulighed for at lave en "test" inde i testen, hvor man forventer at 
noget enten er sandt eller falsk.
Hvis dette ikke passer, vil testen stoppe.
Kan bruges hvis man har en test hvor der er et krav om at en variable eller 
et statement enten er sandt eller falsk før man kan teste det man vil teste.

--------------------------------------------------------------------------

3.2 - Mocking frameworks 

Investigate mocking frameworks for your preferred language. 
Choose at least two frameworks, and answer the questions.
(One could be Mockito, which we saw in class.) 

Jeg har valgt at sammenligne Mockito og JMockit.

• What are their similarities? 



• What are their differences? 



• Which one would you prefer, if any, and why? 



--------------------------------------------------------------------------

4 - HAND-IN

Make the katas individually. 
The other things may be done in groups. 
Handin on the date given in peergrade. 
The hand-in should be code in a repository or zip-file, and a README.md with the written answers.