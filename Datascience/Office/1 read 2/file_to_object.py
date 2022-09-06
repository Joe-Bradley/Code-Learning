import os

import pandas as pd


# xls to dataframe
def read_xls(filename, sheet):
    df = pd.read_excel(filename, encoding="utf-8", sheet_name=sheet)
    return df


# csv to dataframe
def read_csv(filename):
    df = pd.read_csv(filename, encoding="utf-8")
    return df


# txt to list
def read_txt(filename):
    try:
        with open(filename, encoding="utf-8") as f:
            for line in f:
                file_lines = f.readlines()
    except:
        with open(filename, encoding="gbk") as f:
            for line in f:
                file_lines = f.readlines()
    return file_lines


# 1 read file name list
def read_file_name_list():
    path_list = os.listdir()
    return path_list


# make direction
def mkdir(path):
    isExits = os.path.exists(path)
    if not isExits:
        os.makedirs(path)
        print(path + "创建成功")
        print("文件将放在" + path)
    else:
        print(path + "目录已存在")
        print("文件将放在" + path)


# show_all_file: filename = input("请输入文件名：")
def show_all_file():
    path = os.listdir()
    excel_name = []
    for i in path:
        a = i[-3:]
        if a == 'log':
            excel_name.append(i)
    print("开始执行程序：以下为找到的当前目录的日志文件，请输入要统计的日志")
    [print(i) for i in excel_name]
