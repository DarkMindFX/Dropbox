package org.globus.dropbox.api.dal;

import java.util.Date;

public interface Item {

    Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    ItemType getType();
    void setType(ItemType type);

    Long getSize();
    void setSize(Long size);

    Date getCreated();
    void setCreated(Date date);

    Date getUpdated();
    void setUpdated(Date date);




}
