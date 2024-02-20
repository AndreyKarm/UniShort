from datetime import datetime
import time

def nowTime():
    now = datetime.now()

    current_time = now.strftime("%H:%M:%S")
    print("Current Time =", current_time)

while(True):
    time.sleep(1)
    nowTime()