
#Java School
Примеры к лекции по Enterprise JavaBeans
Работа проерялась на wildfly-9.0.0.Final
###Java SE CDI
* простой @Inject в main с помощью **Weld**
* пример работы аннотаций @PostConstruct, @PreDestroy
* unit-тесты с помощью  **Arquillian**

#### Задание
* @Alternative
    * вынести JustGreeter в интерфейс
    * сделать две реализации (например "[Hi | Hello] name")
    * научится подменять реализацию
    
### Java EE CDI
Зачаточная реализация BankServer'а.
* простой @Inject в сервлете

#### Задание
* @Qualifier
    * Создать еще один банк
    * Создать сервлет в котором одновременно два банка
    * Создать сервлет в которам будут оботражаться все доступные банки

###Java EE EJB
* простой @EJB в сервлете

#### Задание
... что нибудь на MDBean
