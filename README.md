# Count words

## Feladatleírás

Írd meg a `WordFinder` osztály `getWordCount` metódusát, amelyik beolvassa a resources mappában lévő `word_finder.txt`
fájlt.

Ebben a fájlban a szavak betűnként szóközzel elválasztva vannak.

A `getWordCount` megszámolja, hogy a paramétereként kapott szó hányszor szerepel a fájlban.
Ha a paraméter `null`, dobj `IllegalArgumentException`-t!

#### Példák

Input:
```text
race
```

Output:
```
{race=41}
```

#### Example 2

Input:

```text
null
```

Output:

```
throws IllegalArgumentException
```
