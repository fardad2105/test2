/*
 * This file is generated by jOOQ.
 */
package hello.tables;


import hello.Indexes;
import hello.Keys;
import hello.Public;
import hello.tables.records.FilmCategoryRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class FilmCategory extends TableImpl<FilmCategoryRecord> {

    private static final long serialVersionUID = -80230462;

    /**
     * The reference instance of <code>public.film_category</code>
     */
    public static final FilmCategory FILM_CATEGORY = new FilmCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmCategoryRecord> getRecordType() {
        return FilmCategoryRecord.class;
    }

    /**
     * The column <code>public.film_category.film_id</code>.
     */
    public final TableField<FilmCategoryRecord, Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.film_category.category_id</code>.
     */
    public final TableField<FilmCategoryRecord, Short> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.film_category.last_update</code>.
     */
    public final TableField<FilmCategoryRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.film_category</code> table reference
     */
    public FilmCategory() {
        this(DSL.name("film_category"), null);
    }

    /**
     * Create an aliased <code>public.film_category</code> table reference
     */
    public FilmCategory(String alias) {
        this(DSL.name(alias), FILM_CATEGORY);
    }

    /**
     * Create an aliased <code>public.film_category</code> table reference
     */
    public FilmCategory(Name alias) {
        this(alias, FILM_CATEGORY);
    }

    private FilmCategory(Name alias, Table<FilmCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private FilmCategory(Name alias, Table<FilmCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FilmCategory(Table<O> child, ForeignKey<O, FilmCategoryRecord> key) {
        super(child, key, FILM_CATEGORY);
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
        return Arrays.<Index>asList(Indexes.FILM_CATEGORY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FilmCategoryRecord> getPrimaryKey() {
        return Keys.FILM_CATEGORY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FilmCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<FilmCategoryRecord>>asList(Keys.FILM_CATEGORY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FilmCategoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FilmCategoryRecord, ?>>asList(Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY, Keys.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY);
    }

    public Film film() {
        return new Film(this, Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY);
    }

    public Category category() {
        return new Category(this, Keys.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmCategory as(String alias) {
        return new FilmCategory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmCategory as(Name alias) {
        return new FilmCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmCategory rename(String name) {
        return new FilmCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmCategory rename(Name name) {
        return new FilmCategory(name, null);
    }
}
