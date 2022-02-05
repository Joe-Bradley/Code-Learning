import json
import pandas as pd
import sqlite3
import tushare as ts
import time

token = '6d55067438b3eddc5bb24bd687a5ad92a432f3b9086201e8e3701561'  # 输入你的token
pro = ts.pro_api(token)


def json_to_str():
    with open("stock_pool.json", 'r') as load_f:
        stock_index = json.load(load_f)
    return stock_index


def stock_to_sql_for(table_name, con_name, start='20190101', end='20190201'):
    stock_code = json_to_str()
    for code in stock_code['股票'].values():
        try:
            data = pro.daily(ts_code=code, start_date=start, end_date=end)
            time.sleep(0.01)
            data.to_sql(table_name, con_name, index=False, if_exists='append')
            print("right code is %s" % code)
        except:
            print("error code is %s" % code)


stock_to_sql_for("stock_for_learning", sqlite3.connect("stock-data.db"))
