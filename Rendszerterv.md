# Rendszerterv

## 1. A rendszer célja
Könyvtárlánc létrehozása esetén biztosítani egy számítógépes alkalmazást, amellyel elsősorban a könyvtári adminisztrációs feladatokat lehet ellátni.
A szerveren tárolt adatbázis új lehetőséget nyújt a könyvtárak számára, így az adatvesztés kockázatát csökkentve lehetőség nyílik könyvtárlánchoz
tartozó könyvtárak állományának megtekintését, az olvasónak lehetőséget tud kínálni a más - lánchoz tartozó könyvtárból is könyvet kölcsönözni. 
 
## 2. Projektterv
Az alkalmazás fejlesztői:
- Füleki Péter
- Simon Árpád

Lehetőség szerint közös munkavégzés, melynek elemei:
- Felhasználóbarát felhasználói felület megalkotása.
- Alkalmazáslogika elkészítése.
- Adatbázis létrehozása, feltöltése.
- Unit tesztek elkészítése.
- Tervezési minták implementálása.
- Felhasználói élmény tesztelése.

## 3. Üzleti folyamatok modellje

### Üzleti szereplők:
- Felhasználó

### Üzleti munkatárs:
- Adminisztrátor
- Help Desk

## 4. Követelmények
### Funkcionális követelmények
- Katalógus 
  - Könyv hozzáadása
    -Könyv kiadó hozzáadása
  - Könyv módosítása
  - Könyv keresése
  - Könyv törlése
- Tagok kezelése
  -Tag létrehozása
  -Tag keresése
- Leltár kezelése
  - Könyv hozzáadása a leltárhoz
  - Leltáron lévő könyv módosítása
  - Leltáron lévő könyv törlése
  - Leltáron lévő könyv keresése
- Könyv kölcsönzése

### Jogi követelmények
- Minden jog fenntartva.

## 5. Funkcionális terv
Az alkalmazást indítva felhasználónév és jelszó párossal lehet a "Funkcionális követelmények"-nél olvasható funkciókat elérni, melynek stabil működéséhez
folyamatos kapcsolatot kell biztosítani a kiszolgáló szerverhez.

## 6. Fizikai környezet

### Java ablakos alkalmazás

### Adatbázis szerver

### Fejlesztői eszközök:
- java 18 SDK
- IntelliJ IDEA 
- XAMP
  - MYSQL/MariaDB
- GitHub

## 7. Architektúrális terv
- IntelliJ fejleseztői környezetein belül, Java 18-as keretrendszerét használva.
- Az adatokat MariaDB adatbázisban tároljuk.
- Az adatok lekérdezését, módosítását, feltöltésést az előbb említett lekérdezőnyelv parancsait integrálva valósítottuk meg.

## 8. Adatbázis terv
- Kiadok
  - KiadoID
  - Kiadonev
- KolcsonzottKonyvek
  - KolcsonzesID (KEY)
  - Leltariszam (FK)(Leltar.Leltarszam)
  - TagID (FK)(Tagok.TagID)
  - KolcsonzesDatum
  - Visszahozva
- Konyvek
  - KonyvID (KEY)
  - Cim
  - KioadoID (FK)(Kiadok.KiadoID)
  - Besorolas
  - Iro
  - Nyelv
  - Ar
- Leltar
  - KonyvID (FK)(Konyvek.KonyvID)
  - Leltariszam (KEY)
  - Hely
  - Kiadva
- Tagok
  - TagID (KEY)
  - Nev
  - SzulDatum
  - Lakhely
  - SzemelyID

## 9. Implementációs terv
###Tervezési minták helye

## 10. Teszt terv
- Unit teszt
- Felhasználói élmény teszt

## 11. Telepítési terv
- Help Desk által távoli asztal kapcsolatot létrehozva
- Adminisztárot által személyesen

## 12. Karbantartási teszt
Az alkalmazás zárt alfa és béta állapotban lesznek elérhetőek. 
Zárt alfa állapotban a felhasználói élmény tapasztalatai alapján módosítjuk az alkalmazást.
Zárt béta fázisban a felhasználók jelentései alapján javítjuk a hibákat, közösen új funkciókat fogalmazunk meg. 
Zárt állapotokban manuális segítséget nyújtunk a frissítéshez Help Desk/Adminisztrátor csapattal, 1.0 fázisban már automatikus frissítésre is lesz lehetőség.




