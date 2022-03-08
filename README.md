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
| [1`|`1] | [1`|`x]  |
| [[1`|`2]`|`2]  | [1`|`[`|`1]] |  
| [0`|`0] |[`|`]|
| [[8`|`5]`|`[3`|`4]] |[5]|

### Boolean
Libovolná hodnota z množiny {True, true, False, false, Maybe, maybe}

## Operandy

### Závorky 
(* *výraz* *) - přednost operací\n
### Mocnina 
**Integer**^**Integer**\n
**Fraction**^**Integer**\n

### Vnořené mocnění 
**Integer**^@\n

### Násobení 
``*`` 
**Integer** * **Integer**\n
**Integer** * **Fraction**\n
**Fraction** * **Integer**\n
**Fraction** * **Fraction**\n
### Sčítání 
**Integer** + **Integer**\n
**Integer** + **Fraction**\n
**Fraction** + **Integer**\n
**Fraction** + **Fraction**\n

### Porovnání
**Integer**>**Integer**\n
**Integer**<**Integer**\n
**Integer**==**Integer**\n
**Integer**>**Fraction**\n
**Integer**<**Fraction**\n
**Integer**==**Fraction**\n
**Fraction**>**Fraction**\n
**Fraction**<**Fraction**\n
**Fraction**==**Fraction**\n
**Fraction**>**Integer**\n
**Fraction**<**Integer**\n
**Fraction**==**Integer**\n
**Boolean**==**Boolean**\n


## Podmíněný skok
if(**Boolean**){* *výraz* *}
