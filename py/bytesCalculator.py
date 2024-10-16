from typing import *
import re

class myString(str):
  def length(self):
    return len(self)
    

def main(bytesString):
  finalized:List[int]=[]
  
  for b in bytesString:
    try:
      f:str = b.strip().strip(";")
      prvf = f.split("=")[0]
      f = f"{f.split('=')[1]}"
      indexes = re.findall(r".*\[(\d+)\]", prvf)[0]
      
      if f.count("\".length()") == 1:
        spaceCount = len(re.findall(r"\"( +)\"", f)[0])
        f = f.replace(
          f'"{" "*spaceCount}".length()', str(spaceCount)
        )
      elif f.count("\".length()") > 1:
        print("scripts can't parsing 2x+ .length()! "+f"at ln{indexes}")
      
      finalized.insert(int(indexes), eval(f, {"myString": myString}))
    except KeyboardInterrupt:
      return;
    
  
  print(finalized)

with open("bytesCalc.txt", "r", encoding="utf-8") as f:
  bytesString = f.readlines()
main(bytesString)