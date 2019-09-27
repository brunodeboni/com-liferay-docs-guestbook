create table FC_Contatto (
	uuid_ VARCHAR(75) null,
	contattoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	nome VARCHAR(75) null,
	cognome VARCHAR(75) null,
	email VARCHAR(75) null,
	formContattoId LONG
);

create table FC_FormContatto (
	uuid_ VARCHAR(75) null,
	formContattoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	name VARCHAR(75) null
);