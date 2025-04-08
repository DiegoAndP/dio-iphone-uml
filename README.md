# dio-iphone-uml
Repositório para entrega do desafio
+------------------+
|     <<Class>>    |
|      iPhone      |
+------------------+
| - nome: String   |
| - modelo: String |
| - ano: int       |
+------------------+
| +ligar()         |
| +desligar()      |
+------------------+
        ^
        |
      +--------------------+-----------------+----------------+
      |                    |                 |                |
      v                    v                 v                v
+---------------+ +---------------+ +---------------+ +-----------------+
| <<Interface>> | | <<Interface>> | | <<Interface>> | | <<Interface>>   |
|   iPodFunc     | | PhoneFunc     | | InternetFunc  | | TouchInterface |
+---------------+ +---------------+ +---------------+ +-----------------+
| +tocarMusica() | | +fazerChamada()| | +abrirSafari()| | +tocarTela()   |
| +verVideos()   | | +enviarSMS()   | | +abrirEmail() | | +usarGestos()  |
| +navegar()     | | +verContatos() | | +usarMapas()  | | +zoomPinça()   |
+---------------+ +---------------+ +---------------+ +-----------------+
