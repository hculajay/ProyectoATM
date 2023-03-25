# ProyectoATM
Actividad Semanal 2 Proyecto ATM
Caso de estudio del ATM

Un banco local pretende instalar una nueva máquina de cajero automático (ATM), para permitir a los usuarios (es decir, los clientes del banco) realizar transacciones financieras básicas.

Cada usuario sólo puede tener una cuenta en el banco. Los usuarios del ATM deben poder ver el saldo de su cuenta, retirar efectivo (es decir, sacar dinero de una cuenta) y depositar fondos (es decir, meter dinero en una cuenta). La interfaz de usuario del cajero automático contiene los siguientes componentes:
una pantalla que muestra mensajes al usuario
un teclado que recibe datos numéricos de entrada del usuario
un dispensador de efectivo que dispensa efectivo al usuario, y
una ranura de depósito que recibe sobres para depósitos del usuario.

El dispensador de efectivo comienza cada día cargado con 500 billetes de UM20.00.

El banco desea que usted desarrolle software para realizar las transacciones financieras que inicien los clientes a través del ATM. Más tarde, el banco integrará el software con el hardware del ATM. El software debe encapsular la funcionalidad de los dispositivos de hardware (por ejemplo: dispensador de efectivo, ranura para depósito) dentro de los componentes de software, pero no necesita estar involucrado en la manera en que estos dispositivos ejecutan su tarea. El hardware del ATM no se ha desarrollado aún, por lo que en vez de que usted escriba un software para ejecutarse en el ATM, deberá desarrollar una primera versión del software para que se ejecute en una computadora personal. Esta versión debe utilizar el monitor de la computadora para simular la pantalla del ATM y el teclado de la computadora para simular el teclado numérico del ATM.

Una sesión con el ATM consiste en la autenticación de un usuario (es decir, proporcionar la identidad del usuario) con base en un número de cuenta y un número de identificación personal (NIP), seguida de la creación y la ejecución de transacciones financieras. Para autenticar un usuario y realizar transacciones, el ATM debe interactuar con la base de datos de información sobre las cuentas del banco [es decir, una colección organizada de datos almacenados en una computadora]. Para cada cuenta de banco, la base de datos almacena un número de cuenta, un NIP y un saldo que indica la cantidad de dinero en la cuenta. [Nota: asumiremos que el banco planea construir sólo un ATM, por lo que no necesitamos preocuparnos de que varios ATM puedan acceder a esta base de datos al mismo tiempo. Lo que es más, vamos a suponer que el banco no realizará modificaciones en la información que hay en la base de datos mientras un usuario accede al ATM].

Al acercarse al ATM por primera vez (suponiendo que nadie lo está utilizando), el usuario deberá experimentar la siguiente secuencia de eventos:
La pantalla muestra el mensaje Bienvenido! y pide al usuario que introduzca un número de cuenta.
El usuario introduce un número de cuenta de cinco dígitos, mediante el teclado.
En la pantalla aparece un mensaje, en el que se pide al usuario que introduzca su NIP (número de identificación personal) asociado con el número de cuenta especificado.
El usuario introduce un NIP de cinco dígitos mediante el teclado.



Si el usuario introduce un número de cuenta válido y el NIP correcto para esa cuenta, la pantalla muestra el menú principal . Si el usuario introduce un número de cuenta inválido o un NIP incorrecto, la pantalla muestra un mensaje apropiado y después el ATM regresa al paso 1 para reiniciar el proceso de autenticación.

Una vez que el ATM autentica al usuario, el menú principal debe contener una opción numerada para cada uno de los tres tipos de transacciones: solicitud de saldo (opción 1), retiro (opción 2) y depósito (opción 3). El menú principal también debe contener una opción para que el usuario pueda salir del sistema (opción 4). Después el usuario elegirá si desea realizar una transacción (oprimiendo 1, 2 o 3) o salir del sistema (oprimiendo 4).



Si el usuario oprime 1 para solicitar su saldo, la pantalla mostrará el saldo de esa cuenta bancaria. Para ello, el ATM deberá obtener el saldo de la base de datos del banco. 

Los siguientes pasos describen las acciones que ocurren cuando el usuario elige la opción 2 para hacer un retiro:
La pantalla muestra un menú que contiene montos de retiro estándar: UM20.00 (opción 1), UM40.00 (opción 2), UM60.00 (opción 3), UM100.00 (opción 4) y UM200 (opción 5). El menú también contiene una opción que permite al usuario cancelar la transacción (opción 6).



El usuario introduce la selección del menú mediante el teclado numérico.
Si el monto a retirar elegido es mayor que el saldo de la cuenta del usuario, la pantalla muestra un mensaje indicando esta situación y pide al usuario que seleccione un monto más pequeño. Entonces el ATM regresa al paso 1. Si el monto a retirar elegido es menor o igual que el saldo de la cuenta del usuario (es decir, un monto de retiro aceptable), el ATM procede al paso 4. Si el usuario opta por cancelar la transacción (opción 6), el ATM muestra el menú principal y espera la entrada del usuario.
Si el dispensador contiene suficiente efectivo para satisfacer la solicitud, el ATM procede al paso 5. En caso contrario, la pantalla muestra un mensaje indicando el problema y pide al usuario que seleccione un monto de retiro más pequeño. Después el ATM regresa al paso 1.
El ATM carga el monto de retiro al saldo de la cuenta del usuario en la base de datos del banco (es decir, resta el monto de retiro al saldo de la cuenta del usuario).
El dispensador de efectivo entrega el monto deseado de dinero al usuario. El usuario introduce la selección del menú mediante el teclado numérico.
La pantalla muestra un mensaje para recordar al usuario que tome el dinero.

Los siguientes pasos describen las acciones que ocurren cuando el usuario elige la opción 3 (partiendo del menú principal) para hacer un depósito:
La pantalla muestra un mensaje que pide al usuario que introduzca un monto de depósito o que escriba 0 (cero) para cancelar la transacción.
El usuario introduce un monto de depósito o 0 mediante el teclado numérico. [Nota: el teclado no contiene un punto decimal o signo de dólares, por lo que el usuario no puede escribir una cantidad real (por ejemplo, UM27.25), sino que debe escribir un monto de depósito en forma de número de centavos (por ejemplo, 2725). Después, el ATM divide este número entre 100 para obtener un número que represente un monto en unidades monetarias (por ejemplo, 2725 ÷ 100 = 27.25)].
Si el usuario especifica un monto a depositar, el ATM procede al paso 4. Si elije cancelar la transacción (escribiendo 0), el ATM muestra el menú principal y espera la entrada del usuario.
La pantalla muestra un mensaje indicando al usuario que introduzca un sobre de depósito en la ranura para depósitos.
Si la ranura de depósitos recibe un sobre dentro de un plazo de tiempo no mayor a dos minutos, el ATM abona el monto del depósito al saldo de la cuenta del usuario en la base de datos del banco (es decir, suma el monto del depósito al saldo de la cuenta del usuario). [Nota: este dinero no está disponible de inmediato para retirarse. El banco debe primero verificar físicamente el monto de efectivo en el sobre de depósito, y cualquier cheque que éste contenga debe validarse (es decir, el dinero debe transferirse de la cuenta del emisor del cheque a la cuenta del beneficiario). Cuando ocurra uno de estos eventos, el banco actualizará de manera apropiada el saldo del usuario que está almacenado en su base de datos. Esto ocurre de manera independiente al sistema ATM.] Si la ranura de depósito no recibe un sobre dentro de un plazo de tiempo no mayor a dos minutos, la pantalla muestra un mensaje indicando que el sistema canceló la transacción debido a la inactividad. Después el ATM muestra el menú principal y espera la entrada del usuario. 

Una vez que el sistema ejecuta una transacción en forma exitosa, debe volver a mostrar el menú principal para que el usuario pueda realizar transacciones adicionales. Si el usuario elije salir del sistema, la pantalla debe mostrar un mensaje de agradecimiento y después el mensaje de bienvenida para el siguiente usuario.
