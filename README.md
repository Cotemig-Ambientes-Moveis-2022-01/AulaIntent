# AulaIntent
 
### Abrindo uma nova Activity

```kotlin
 var intent = Intent(this, ForgotActivity::class.java) // Criando uma Intent "abrir uma Activity"
 intent.putExtra("email", email.text.toString()) // <--- adicionando um parâmetro chamado email na intent
 startActivity(intent) // iniciando Activity
```

## Atenção para o putExtra

Esse método para parâmetro para a Activity que a Intent irá abrir. Nesse exemplo acima o parâmetro chama-se "email".

## Atenção em como "pegar" o parâmetro

Na ForgotActivity utilizamos a intent para obter o parâmetro

```kotlin
var email = findViewById<EditText>(R.id.email)
email.setText(intent.getStringExtra("email")) // <- "email" - nome do parâmetro
```
