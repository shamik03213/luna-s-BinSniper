import hashlib
from Crypto.Cipher import Blowfish, DES
import base64

def DecodeBlowfish(encrypt, key):
    try:
        # MD5ハッシュを使用して鍵を生成
        key_md5 = hashlib.md5(key.encode('utf-8')).digest()
        cipher = Blowfish.new(key_md5, Blowfish.MODE_ECB)
        
        # Base64デコード
        encrypted_bytes = base64.b64decode(encrypt)
        
        # Blowfishで復号化
        decrypted_bytes = cipher.decrypt(encrypted_bytes)
        
        # PKCS5パディングを除去
        padding_len = decrypted_bytes[-1]
        if isinstance(padding_len, int) and padding_len <= Blowfish.block_size:
            decrypted_bytes = decrypted_bytes[:-padding_len]
        
        return decrypted_bytes.decode('utf-8')
    except Exception as e:
        print(f"Error in decode_blowfish: {e}")
        return "null"


def DecodeDES(encrypt, key):
    try:
        # 鍵をMD5でハッシュし、指定された長さに切り取る
        key_md5 = hashlib.md5(key.encode('utf-8')).digest()[:8]
        cipher = DES.new(key_md5, DES.MODE_ECB)
        
        # Base64デコード
        encrypted_bytes = base64.b64decode(encrypt)
        
        # DESで復号化
        decrypted_bytes = cipher.decrypt(encrypted_bytes)
        
        # パディングをPKCS5で除去
        padding_len = decrypted_bytes[-1]
        decrypted = decrypted_bytes[:-padding_len]
        
        return decrypted.decode('utf-8')
    except Exception as e:
        print(f"Error in decode_des: {e}")
        return "null"
      

def DecodeBase64(encrypt, key):
    try:
        # Base64デコード
        decoded_encrypt = base64.b64decode(encrypt).decode('utf-8')
        
        # XOR処理
        string_builder = []
        keys = key
        for i in range(len(decoded_encrypt)):
            char = decoded_encrypt[i]
            # XOR演算
            decrypted_char = chr(ord(char) ^ ord(keys[i % len(keys)]))
            string_builder.append(decrypted_char)
        
        return ''.join(string_builder)
    except Exception as e:
        print(f"Error in decode_base64: {e}")
        return "null"


from typing import *
import re
def main(n):
  final:List[str]=[]
  
  for b in n:
    try:
      f:str = b.strip().strip(";").replace("BinSnipeLogic.", "")
      prvf = f.split("] = D")[0] + "]"
      f = "D" + f.split('] = D')[1].strip()
      indexes = re.findall(r".*\[(\d+)\]", prvf)[0]
      final.insert(int(indexes), eval(f, {"DecodeBase64": DecodeBase64, "DecodeDES": DecodeDES, "DecodeBlowfish": DecodeBlowfish}))
    except KeyboardInterrupt:
      return
  
  print(str(final).replace("'", '"'))


with open("byteCrypt.txt", "r", encoding="utf-8") as f:
  main(f.readlines())