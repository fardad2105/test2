/*
 * This file is generated by jOOQ.
 */
package hello.tables;


import hello.Indexes;
import hello.Keys;
import hello.Public;
import hello.tables.records.InventoryRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Inventory extends TableImpl<InventoryRecord> {

    private static final long serialVersionUID = -403752836;

    /**
     * The reference instance of <code>public.inventory</code>
     */
    public static final Inventory INVENTORY = new Inventory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InventoryRecord> getRecordType() {
        return InventoryRecord.class;
    }

    /**
     * The column <code>public.inventory.inventory_id</code>.
     */
    public final TableField<InventoryRecord, Integer> INVENTORY_ID = createField("inventory_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('inventory_inventory_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.inventory.film_id</code>.
     */
    public final TableField<InventoryRecord, Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.inventory.store_id</code>.
     */
    public final TableField<InventoryRecord, Short> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.inventory.last_update</code>.
     */
    public final TableField<InventoryRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.inventory</code> table reference
     */
    public Inventory() {
        this(DSL.name("inventory"), null);
    }

    /**
     * Create an aliased <code>public.inventory</code> table reference
     */
    public Inventory(String alias) {
        this(DSL.name(alias), INVENTORY);
    }

    /**
     * Create an aliased <code>public.inventory</code> table reference
     */
    public Inventory(Name alias) {
        this(alias, INVENTORY);
    }

    private Inventory(Name alias, Table<InventoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Inventory(Name alias, Table<InventoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Inventory(Table<O> child, ForeignKey<O, InventoryRecord> key) {
        super(child, key, INVENTORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_STORE_ID_FILM_ID, Indexes.INVENTORY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<InventoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INVENTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InventoryRecord> getPrimaryKey() {
        return Keys.INVENTORY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InventoryRecord>> getKeys() {
        return Arrays.<UniqueKey<InventoryRecord>>asList(Keys.INVENTORY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InventoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InventoryRecord, ?>>asList(Keys.INVENTORY__INVENTORY_FILM_ID_FKEY);
    }

    public Film film() {
        return new Film(this, Keys.INVENTORY__INVENTORY_FILM_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Inventory as(String alias) {
        return new Inventory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Inventory as(Name alias) {
        return new Inventory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Inventory rename(String name) {
        return new Inventory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Inventory rename(Name name) {
        return new Inventory(name, null);
    }
}
