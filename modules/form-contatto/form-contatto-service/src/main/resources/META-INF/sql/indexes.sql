create index IX_90F3C7D5 on FC_Contatto (groupId, formContattoId);
create index IX_63003CBC on FC_Contatto (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E3A8C23E on FC_Contatto (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A3D3767E on FC_FormContatto (groupId);
create index IX_2D2F4EA0 on FC_FormContatto (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D97AFD22 on FC_FormContatto (uuid_[$COLUMN_LENGTH:75$], groupId);