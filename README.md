# Definice jazyka Fň
## Datové typy
### Integer 

Řetězec čísel zažínající znakem z {1, 2, 3, 4, 5, 6, 7, 8, 9, ?} a pokračující libovolným počtem znaků z {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, ?}, nebo znak 0   

| Validní  | Nevalidní |
| ------------- | ------------- |
| 1  | 024  |
| 12345678923132123132131321  | 132x |  
|0|1.5|
|1?|1,0|
|???|00|
|?0|0?|

### Fraction 

Uspořádaná dvojice datových typů Integer a Fraction, kde první ve dvojici má význam čitatele a druhý jmenovatele. 
[**Integer**|**Integer**]\n
[**Integer**|**Fraction**]\n
[**Fraction**|**Integer**]\n
[**Fraction**|**Fraction**]\n


| Validní  | Nevalidní |
| ------------- | ------------- |
| [1``|``1] | [1``|``x]  |
| [[1``|``2]``|``2]  | [1``|``[``|``1]] |  
| [0``|``0] |[``|``]|
| [[8``|``5]``|``[3``|``4]] |[5]|

### Boolean
Libovolná hodnota z množiny {True, true, False, false, Maybe, maybe}

## Operandy

### Závorky 
() - přednost operací
### Mocnina 
**Integer**^**Integer**
**Fraction**^**Integer**

### Vnořené mocnění 
**Integer**^@

### Násobení 
``*`` 
**Integer**``*``**Integer**
**Integer**``*``**Fraction**
**Fraction**``*``**Integer**
**Fraction**``*``**Fraction**
### Sčítání 
**Integer**``+``**Integer**
**Integer**``+``**Fraction**
**Fraction**``+``**Integer**
**Fraction**``+``**Fraction**

### Porovnání
**Integer**>**Integer**
**Integer**<**Integer**
**Integer**==**Integer**
**Integer**>**Fraction**
**Integer**<**Fraction**
**Integer**==**Fraction**
**Fraction**>**Fraction**
**Fraction**<**Fraction**
**Fraction**==**Fraction**
**Fraction**>**Integer**
**Fraction**<**Integer**
**Fraction**==**Integer**
**Boolean**==**Boolean**


## Podmíněný skok
if(**Boolean**){* *výraz* *}
