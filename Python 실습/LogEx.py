from random import *
from datetime import datetime


f= open('count_log.txt','w')
for i in range(1,11):
    dt=datetime.now()
    stamp=str(dt)
    #print(str(stamp))
    randn=random()*100000
    value=str(randn)
    #print(str(value))
    f.write(stamp)
    f.write(value+"\n")