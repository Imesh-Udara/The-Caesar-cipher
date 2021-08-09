object seasar {
  def main(args: Array[String]): Unit = {


      val encryption=(c:Char,key:Int,alphabet:String)=>{
        alphabet((alphabet.indexOf(c)+key)%alphabet.size)
      }

      val decryption=(c:Char,key:Int,alphabet:String)=>{
        if(alphabet.indexOf(c)<key)
        {
          alphabet(alphabet.indexOf(c)-key+alphabet.length())
        }
        else
        {
          alphabet((alphabet.indexOf(c)-key)%alphabet.size)
        }
      }

      val cipher=(f:(Char,Int,String)=>Char,text:String,key:Int,alphabet:String)=>text.map(f(_,key,alphabet))


      val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz "
      var text="The Caesar Cipher is a very simple \nencryption technique in which one replaces each \nletter in the plaintext for another letter that is a fxed \nnumber of positions down the alphabet."

      val ct=cipher(encryption,text,5,alphabet)
      val pt=cipher(decryption,ct,5,alphabet)

      println("Text     : "+text)
      println("Encrypted Text: "+ct)
      println("Decrypted Text: "+pt)

    }
  //}
}
