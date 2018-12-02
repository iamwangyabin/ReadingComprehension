import json
import os

os.chdir("Dataset")
with open("zhidao.train.json", encoding='utf-8') as f:
    line = f.readline()
    d = json.loads(line)
    f.close()

print(json.dumps(d, indent=4))

for (k,v) in d.items():
    print(k)