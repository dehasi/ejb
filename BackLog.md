Требуется реализовать **BankServer** – серверное приложение, 
которое будет отвечать на запросы создания счета, 
просмотра баланса и его изменения.

### Описание задачи
Требуется создать серверное приложение, 
которое будет слушать входящие TCP запросы и выполнять некоторые операции в несколько потоков.
Протокол общения – сериализованные в JSON сообщения в одну строку. 
 

#### Формат запроса:

Обязательно:

*account* – идентификатор аккаунта, String
*operation* – идентификатор операции, String
Где требуется:

value – денежное значение в формате XXXXX.00, 
String (после целового значения (количество долларов) 
обязательно следуют два знака (количество центов) 
Значения меньше одного цента быть не может.

#### Формат ответа:

Обязательно:

status – статус операции, String
Где требуется:

error – идентификатор ошибки, String
balance – денежное значение в аналогичном формате поля value
Операции:

Создание нового счета (идентификатор операции – new)

Необходимо создать новый счет с именем account и данным в value изначальным балансом.

Ответ:

status = ok, если такого счета ранее не существовало и он успешно добавился.
status = error, error = account_exist, если счет уже существует.
Добавление денег на счет (идентификатор операции – deposit)

Необходимо добавить на новый счет с именем account сумму в количестве value.

Ответ:

status = ok, если операция успешна.
status = error, error = account_not_exist, если аккаунта с данным именем не существует.
Снятие денег со счета (идентификатор операции – withdraw)

Необходимо снять со счета с именем account сумму в количестве value.

Ответ:

status = ok, если операция успешна.
status = error, error = not_enough_money, если недостаточно средств для снятия данной суммы.
status = error, error = account_not_exist, если аккаунта с данным именем не существует.
Просмотр баланса (идентификатор операции – balance)

Необходимо вернуть в поле balance остаток на счету с именем account.

Ответ:

status = ok, balance=текущий баланс если операция успешна.
status = error, error = account_not_exist, если аккаунта с данным именем не существует.
Неправильный формат или неизвестная операция

Ответ:

status = error, error = wrong_request