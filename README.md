
#Java School
Примеры к лекции по Enterprise JavaBeans

(Тестировалось на wildfly-9.0.0.Final)
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
* @Named
    * Создать еще один банк
    * Создать сервлет, разрулить конфликты
* @Qualifier
    * Создать сервлет в котором одновременно два **разных** банка
    ```java
    Bank bank1;
    Bank bank2;
    ```
* @Any    
    * Создать сервлет в которам будут оботражаться все доступные банки
    ```java
    Colletcion<Bank> banks;
    ```

###Java EE EJB
* простой @EJB в сервлете
* unit-тесты с помощью **tomee-embedded**

#### Задание
* @Interceptors, @AroundInvoke, @ExcludeClassInterceptors
    * Создать бин
    * Создать interceptor, который будет логировать вызовы функций
    * Исключить какую-нибудь функцию из interceptor
* @MessageDriven
    * не в этой лекции :(
    * найти quckstart своего любимого EJB-контейнера
    (мой любимый -  [WildFly](https://github.com/sgilda/wildfly-quickstart))
    * разрбрася с настройками EJB-контейнера
    * ...
    * profit    