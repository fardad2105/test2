package hello.service;

import hello.tables.daos.InventoryDao;
import hello.tables.pojos.Inventory;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record3;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InventoryServiceImple extends AbstractService<Inventory> {

    @Autowired
    DSLContext dsl;

    InventoryDao inventoryDao = new InventoryDao(this.configuration);

    @Override
    public boolean save(Inventory inventory) {
        return super.save(inventory);
    }

    @Override
    public Inventory find(int id) {
        return super.find(id);
    }


    public List<Inventory> findBySF(int storeId,int filmId)
    {
        Result<Record3<Integer, Short, Short>> r = dsl.select(hello.tables.Inventory.INVENTORY.INVENTORY_ID,hello.tables.Inventory.INVENTORY.STORE_ID,hello.tables.Inventory.INVENTORY.FILM_ID)
            .from(hello.tables.Inventory.INVENTORY)
            .where(hello.tables.Inventory.INVENTORY.STORE_ID.eq((short) storeId).and(hello.tables.Inventory.INVENTORY.FILM_ID.eq((short) filmId)))
            .fetch();

        List<Inventory> list = new ArrayList<>();

        for (Record rec  : r)
        {
            Inventory inv = new Inventory();
            inv.setInventoryId((Integer) rec.get(0));
            inv.setStoreId((Short) rec.get(1));
            inv.setFilmId((Short) rec.get(2));
            list.add(inv);
        }

        return list;
    }

    public Inventory findByFilmId(int filmId) {
        return super.find(filmId);
    }

    @Override
    public List<Inventory> findAll() {
        return super.findAll();
    }

    @Override
    public List<Inventory> findEntries(int firstResult, int maxResults) {
        return super.findEntries(firstResult, maxResults);
    }

    @Override
    public long countAll() {
        return super.countAll();
    }

    @Override
    public Inventory update(Inventory inventory) {
        return super.update(inventory);
    }

    @Override
    public void delete(Inventory inventory) {
        super.delete(inventory);
    }
}
