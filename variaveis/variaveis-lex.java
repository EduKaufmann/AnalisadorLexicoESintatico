import java.util.*;
%%
%class variaveis
%standalone
%line
%column
inteiros = (("int ")("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)((", "|",")("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*))*)";"
chara = (("char ")("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)((", "|",")("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*))*)("["[0-9]*"]")?";"
reais = (("float ")("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*)((", "|",")("_"[a-zA-Z_0-9]+|[a-zA-Z]+[_0-9]*))*)";"

%{
 List<String> inteiros = new ArrayList();
 List<String> chara = new ArrayList();
 List<String> reais = new ArrayList();
%}

%eof{
  System.out.print("Inteiros: \n");
  for(int i=0;i<inteiros.size();i++){
    if(i==inteiros.size()-1)
     System.out.println(inteiros.get(i));
    else
     System.out.print(inteiros.get(i)+"\n");
  }
  System.out.print("\n");
  System.out.print("Chars: \n");
  for(int i=0;i<chara.size();i++){
    if(i==chara.size()-1)
     System.out.println(chara.get(i));
    else
     System.out.print(chara.get(i)+"\n");
  }
  System.out.print("\n");
  System.out.print("Reais: \n");
  for(int i=0;i<reais.size();i++){
    if(i==reais.size()-1)
     System.out.println(reais.get(i));
    else
     System.out.print(reais.get(i)+"\n");
  }


%eof}

%%
{inteiros} {inteiros.add(yytext());}
{chara} {chara.add(yytext());}
{reais} {reais.add(yytext());}
\n {}
. {}

