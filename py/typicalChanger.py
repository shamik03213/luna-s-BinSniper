

def main(n, option):
  ln = []
  
  rpla = option["targetA"]
  hastr = option["hasString"]
  rpl1v = option["targetAValue"]
  #rpl2v = option["targetBValue"]
  
  for indexes, x in enumerate(n):
    for i, v in enumerate(rpl1v):
      value = str(v)
      
      if hastr:
        value = f'"{value}"'
      
      x = x.replace(
        f"{rpla}[{i}]", value
      )
    ln.insert(indexes, x.strip("\n"))
  return ln

import json
with open("typical.json", "r", encoding="utf-8") as jf:
  js = json.load(jf)

with open("typical.txt", "r", encoding="utf-8") as f:
  last = main(f.readlines(), js)
  
with open("typical.txt", "w", encoding="utf-8") as f:
  f.write("\n".join(last))