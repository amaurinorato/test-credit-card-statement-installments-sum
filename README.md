# test-credit-card-statement-installments-sum
Repository containing a test that consists in summing all the installments of a credit card statements and show the month total

# Test description
Given the folloing file, containing transactions installments of a credit card, write a function, using your preferrable language, that prints out the sum of all installments in the month

```
17/02  	AME DIGITAL A PARC 06/12 SAO PAULO  	  BR  	$110.48
18/02  	AMAZON MARKET PARC 06/10 SAO PAULO  	  BR  	$65.97
18/02  	MERCADOLIVRE PARC 06/06 SANTANA DE P  	  BR  	$10.20
23/02  	PAYPAL PARC 06/06 SAO PAULO  	          BR  	$15.33
24/11  	AMERICANAS PARC 09/12 RIO DE JANEI  	  BR  	$383.33
24/02  	MERCADOLIVRE PARC 06/06 SANTANA DE P  	  BR  	$17.56
27/06  	DERMOVIDA FOR PARC 02/03 COTIA  	      BR  	$49.33
27/01  	MERCADOLIVRE PARC 07/10 SANTANA DE P  	  BR  	$62.80
27/06  	Amazon Market PARC 02/08 SAO PAULO  	  BR  	$31.81
29/06  	PERSONAL SYST PARC 02/12 SAO PAULO  	  BR  	$480.25
28/02  	MERCADOLIVRE PARC 06/06 SANTANA DE P  	  BR  	$34.93
29/04  	AME DIGITAL A PARC 04/04 SAO PAULO  	  BR  	$33.66
03/06  	MercPag MERCA PARC 03/06 OSASCO  	      BR  	$13.06
01/03  	CASAS BAHIA PARC 06/10 CAMPO BOM  	      BR  	$290.43
02/08  	AME DIGITAL A PARC 01/12 SAO PAULO  	  BR  	$81.11
05/07  	GIULIANA FLOR PARC 02/03 SAO CAETANO  	  BR  	$61.73
04/01  	AMERICANAS PARC 08/12 RIO DE JANEI  	  BR  	$174.99
04/05  	AME DIGITAL A PARC 04/04 SAO PAULO  	  BR  	$33.41
06/07  	MLP MAGAZINEL PARC 02/03 SAO PAULO  	  BR  	$58.46
07/08  	MERCADOLIVRE PARC 01/06 OSASCO  	      BR  	$19.19
07/06  	PG omens PARC 03/06 11994989444  	      BR  	$58.16
10/05  	MercPag MERCA PARC 04/04 OSASCO  	      BR  	$9.86
12/03  	Amazon Market PARC 06/10 SAO PAULO  	  BR  	$74.10
09/05  	AME DIGITAL A PARC 04/12 SAO PAULO  	  BR  	$62.49
10/05  	BRA CASARIN PARC 04/12 PORTO ALEGRE  	  BR  	$309.90
10/03  	AMERICANAS PARC 06/10 OSASCO  	          BR  	$71.99
12/06  	MercPag MERCA PARC 03/06 OSASCO  	      BR  	$7.45
13/05  	PHYTOART FARM PARC 04/04 OSASCO  	      BR  	$62.75
13/06  	Cns PARC 03/05 OSASCO  	                  BR  	$83.80
13/06  	C A SH UNIAO PARC 03/03 OSASCO  	      BR  	$123.33
17/06  	RIACHUELO 008 PARC 03/03 OSASCO  	      BR  	$59.96
17/06  	LOJAS RENNER PARC 03/03 OSASCO  	      BR  	$93.26
20/05  	SHOP FACIL PARC 04/12 SAO PAULO  	      BR  	$5.41
```

For example, let's say the first month is January, if we sum the values of all open installments that are shown in the file above, we would have a total of $3050.49. So, the program should print something like January:3050.49 or 1:3050.49

You don't need to worry about the year changing
