# AulaIntent
 
### Abrindo uma nova Activity

```kotlin

 var intent = Intent(this, ForgotActivity::class.java) // Criando uma Intent "abrir uma Activity"
 intent.putExtra("email", email.text.toString()) // <--- adicionando um parâmetro chamado email na intent
 startActivity(intent) // iniciando Activity
        
```

## Atenção para o putExtra

Esse método
