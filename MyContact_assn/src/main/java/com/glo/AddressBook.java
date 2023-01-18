package com.glo;

import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

    Trie<Contact> trie;

    public AddressBook() {
        //TODO
        this.trie=new Trie<Contact>();
    }

    public void addContact(Contact contact) throws Exception {
        //TODO

        if(this.trie.search(contact.getName()).isEmpty()){
            this.trie.insert(contact.getName(), contact);
        }else{
            throw new Exception();
        }

    }

    public void deleteContact(String name) throws Exception {
        //TODO
        List<Contact> listOfContacts = this.trie.search(name);
        if(!listOfContacts.isEmpty()){
            this.trie.delete(name,listOfContacts.get(0));
        }else{
            throw new Exception();
        }
    }

    public void updateContact(String name, Contact contact) throws Exception {
        //TODO
            if(this.trie.search(name).isEmpty()){
                throw new Exception();
            }else{
                this.deleteContact(name);
                this.trie.insert(name, contact);
            }
    }

    public List<Contact> searchByName(String name) throws Exception {
        //TODO
        List<Contact> contactLs = this.trie.search("");
        return contactLs.stream().filter((c)-> c.getName().toLowerCase().startsWith(name.toLowerCase())).collect(Collectors.toList());

    }

    public List<Contact> searchByOrganisation(String organisation) throws Exception {
        //TODO
        List<Contact> contactLs = this.trie.search("");
        return contactLs.stream().filter((c)->c.getOrganisation().toLowerCase().startsWith(organisation.toLowerCase())).collect(Collectors.toList());


    }
}