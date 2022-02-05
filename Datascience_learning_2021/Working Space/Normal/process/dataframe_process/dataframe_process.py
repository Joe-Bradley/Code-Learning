# dataframe中的筛选
df = df[df['交易类型编码'].isin(['200101', '200103'])]

df = df[df['运营商'].str.contains("联通|移动")]

bw_create_time = datetime.datetime.strptime(df.iat[i, 8], "%Y-%m-%d %H:%M:%S")

#
