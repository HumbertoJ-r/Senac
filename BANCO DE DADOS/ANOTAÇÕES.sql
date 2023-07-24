delimiter //$$
create procedure exibir_meida (nota decimal (5,2))
begin

	declare exibir varchar(30);

	if nota >+ 7 then 
		set exibir := "Aprovado";
	elseif nota + 5 then
		set exibir := "Exame";
	else 
		set exibir := "Reprovado";
	end if;

	select exibir;
end;
//$$ 
DELIMITER ;
call exibir_media(9);
