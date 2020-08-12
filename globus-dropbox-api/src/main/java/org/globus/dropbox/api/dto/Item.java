package org.globus.dropbox.api.dto;

import org.globus.dropbox.api.dal.ItemType;

import java.util.Date;

public class Item {

    private ItemType type;
    private String name;
    private Date created;
    private Date updated;
    private Long size;

    public Item() {

    }

    public Item(String name, ItemType type) {
        this.setName(name);
        this.setType(type);
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
