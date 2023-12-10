import mysql.connector
from time import sleep
from time import localtime
from pyautogui import press
from webbrowser import open
from urllib.parse import quote
from pywhatkit.core.core import check_number
from pywhatkit.core.exceptions import CountryCodeException
from pywhatkit.core.log import log_message

cnx = mysql.connector.connect(
    host="localhost",
    port=3306,
    user="root",
    password="root",
    database="emp",
    auth_plugin='mysql_native_password'
)
if cnx.is_connected():
    print("db OK")
cursor = cnx.cursor()


cursor.execute("SELECT telefone FROM Usuario_pf WHERE status_usuario = 1")
debters = []
for (phone,) in cursor:
    debters.append(phone)


msg = "VOCÊ TEM DÍVIDAS PENDENTES!!!"

for phone in debters:
    if not check_number(number=phone):
        raise CountryCodeException("Country Code Missing in Phone Number!")
    try:
        open(f"https://web.whatsapp.com/send?phone={phone}&text={quote(msg)}")
        sleep(15)
        press("enter")
        print("enter ok")
        log_message(_time=localtime(), receiver=phone, message=msg)
    except:
        print("error")
    print(phone)

cnx.close()
