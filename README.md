Для успешной аутентификации в сервисе необходимо выполнить следующий запрос

POST http://localhost:8080/login 
{"username" : "oliver","password" : "password"}

Из заголовков ответа взять значение заголовка Authorization

Все последующие обращение к ресурсам сервиса делать с добавлением в заголовки
Authorization  Bearer {token}