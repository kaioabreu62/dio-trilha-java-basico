![Diagrama](Exemplo - Diagrama de Classe UML.drawio)
<mxfile host="app.diagrams.net" modified="2024-05-06T22:08:27.550Z" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36 OPR/108.0.0.0" etag="v91w0hzrL0GLBN-IJ2Q5" version="24.3.1" type="github" pages="2">
  <diagram id="C5RBs43oDa-KdzZeNtuy" name="Case 1">
    <mxGraphModel dx="1823" dy="525" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="WIyWlLk6GJQsqaUBKTNV-0" />
        <mxCell id="WIyWlLk6GJQsqaUBKTNV-1" parent="WIyWlLk6GJQsqaUBKTNV-0" />
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-14" value="" style="endArrow=diamondThin;endFill=1;endSize=24;html=1;rounded=0;exitX=0.5;exitY=0;exitDx=0;exitDy=0;entryX=0.5;entryY=1;entryDx=0;entryDy=0;" edge="1" parent="WIyWlLk6GJQsqaUBKTNV-1" target="IWNMwI_RbCS1JzZMY9Op-15">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="435" y="238" as="sourcePoint" />
            <mxPoint x="434.5" y="148" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-15" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;Adimissao&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- dataAdmissao : Date&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- nomeCanditado : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- cargo : String&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ contratar(dataContrato : Date, duracao : int) : void&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="290" y="20" width="290" height="120" as="geometry" />
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-16" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;Candidato&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- nome : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- dataNascimento : Date&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- cpf : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- email : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- pretensaoSalarial : Double&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ candidatar(String solicitacao) : void&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;&lt;br&gt;&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="330" y="238" width="210" height="162" as="geometry" />
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-17" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;Profissao&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- cargo : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- experienciaProfissional : int&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ dadosProfissional(dados : Profissao) : void&amp;nbsp;&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="770" y="264" width="260" height="110" as="geometry" />
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-18" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;Telefone&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- telefoneResidencial : int&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- telefoneCelular : int&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- telefoneEmpresarial : int&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ ligar(numeroTelefone : int) : void&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="-120" y="270" width="220" height="130" as="geometry" />
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-19" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;Endereco&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- rua : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- bairro : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- cidade : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- uf : String&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ adicionarEndereco(dados : Endereco) : void&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="310" y="530" width="280" height="150" as="geometry" />
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-22" value="" style="endArrow=diamondThin;endFill=0;endSize=24;html=1;rounded=0;exitX=0.453;exitY=-0.009;exitDx=0;exitDy=0;exitPerimeter=0;entryX=0.509;entryY=1;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="WIyWlLk6GJQsqaUBKTNV-1" source="IWNMwI_RbCS1JzZMY9Op-19" target="IWNMwI_RbCS1JzZMY9Op-16">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="435.79000000000013" y="520.0000000000001" as="sourcePoint" />
            <mxPoint x="434" y="410" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-25" value="telefones" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="170" y="330" width="70" height="30" as="geometry" />
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-26" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="110" y="280" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-27" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="399" y="200" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-28" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="399" y="490" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="IWNMwI_RbCS1JzZMY9Op-29" value="0..1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="WIyWlLk6GJQsqaUBKTNV-1">
          <mxGeometry x="720" y="330" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="zv3ifnshxXin6kfANA14-1" value="" style="endArrow=diamondThin;endFill=0;endSize=24;html=1;rounded=0;exitX=1.005;exitY=0.408;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="WIyWlLk6GJQsqaUBKTNV-1" source="IWNMwI_RbCS1JzZMY9Op-18">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="360" y="320" as="sourcePoint" />
            <mxPoint x="330" y="323" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="zv3ifnshxXin6kfANA14-3" value="" style="endArrow=diamondThin;endFill=0;endSize=24;html=1;rounded=0;entryX=1;entryY=0.5;entryDx=0;entryDy=0;exitX=0;exitY=0.5;exitDx=0;exitDy=0;" edge="1" parent="WIyWlLk6GJQsqaUBKTNV-1" source="IWNMwI_RbCS1JzZMY9Op-17" target="IWNMwI_RbCS1JzZMY9Op-16">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="500" y="430" as="sourcePoint" />
            <mxPoint x="660" y="430" as="targetPoint" />
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
  <diagram id="_uLZ5IIc4sNaHIBNBYrM" name="Case 2">
    <mxGraphModel dx="996" dy="525" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="HP6sKCpzYR2WVCt917dd-1" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;Cliente&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- nomeCliente : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- cpf : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- email : String&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;&lt;br&gt;&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="70" y="73" width="220" height="100" as="geometry" />
        </mxCell>
        <mxCell id="HP6sKCpzYR2WVCt917dd-2" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;Pedido&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- dataPedido : Date&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- statusPedido : String&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ addItem(item : ItemPedido) : void&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ removeItem(item : ItemPedido) : void&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ totalPedido() : Double&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="550" y="33" width="280" height="140" as="geometry" />
        </mxCell>
        <mxCell id="HP6sKCpzYR2WVCt917dd-3" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;ItemPedido&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- codPedido : int&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- qtdPedido : int&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- precoPedido : Double&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ subTotal() : Double&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="550" y="330" width="240" height="120" as="geometry" />
        </mxCell>
        <mxCell id="HP6sKCpzYR2WVCt917dd-4" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;Produto&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- nomeProduto : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;- precoProduto : Double&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;&lt;br&gt;&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="1011" y="332.5" width="230" height="115" as="geometry" />
        </mxCell>
        <mxCell id="6_Dq6MaXcgytr_tMg54q-2" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="1">
          <mxGeometry x="300" y="88" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="6_Dq6MaXcgytr_tMg54q-3" value="" style="endArrow=diamondThin;endFill=1;endSize=24;html=1;rounded=0;entryX=0.424;entryY=1.049;entryDx=0;entryDy=0;entryPerimeter=0;exitX=0.5;exitY=0;exitDx=0;exitDy=0;" edge="1" parent="1" source="HP6sKCpzYR2WVCt917dd-3">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="670" y="323.14" as="sourcePoint" />
            <mxPoint x="668.72" y="173" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="6_Dq6MaXcgytr_tMg54q-4" value="- itens" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="1">
          <mxGeometry x="660" y="250" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="6_Dq6MaXcgytr_tMg54q-5" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="1">
          <mxGeometry x="630" y="290" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="6_Dq6MaXcgytr_tMg54q-6" value="" style="endArrow=diamondThin;endFill=1;endSize=24;html=1;rounded=0;exitX=0;exitY=0.5;exitDx=0;exitDy=0;entryX=1;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="HP6sKCpzYR2WVCt917dd-4" target="HP6sKCpzYR2WVCt917dd-3">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="810" y="270" as="sourcePoint" />
            <mxPoint x="970" y="270" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="6_Dq6MaXcgytr_tMg54q-7" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="1">
          <mxGeometry x="980" y="398" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="6_Dq6MaXcgytr_tMg54q-9" value="" style="endArrow=diamondThin;endFill=1;endSize=24;html=1;rounded=0;" edge="1" parent="1">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="290" y="120" as="sourcePoint" />
            <mxPoint x="550" y="118" as="targetPoint" />
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
