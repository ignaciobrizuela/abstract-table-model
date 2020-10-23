# Abstract table model

_In these scripts you will see how to customize your own table_

## Let´s get started 🚀

_First of all we need to create a Object Class. In this e.g. I used TSOCIO._



### Pre-requirements 📋

_This is only a fragment of the entire project. Yo will need to create windows, presenter, services, repositories, etc_

_I wrote all the code in Java. I´m using Netbeans IDE 8.2._

### Proccess 🔧

_Let's define the table attributes that we want to show._

_In my case they are._

```
private final int COLUMN_NAME     = 0;
private final int COLUMN_DNI      = 1;
private final int COLUMN_PHONE    = 2;
private final int COLUMN_CATEGORY = 3;
```

_We also need to indentify the number of column that we'll see in te table._

```
private final int N_COLUMN = 4;
```

_Then it is necessary to Override some methods._

* To get the number of rows.

```
@Override
public int getRowCount() {
    return this.tSocio_to_show.size();
}
```
* To get the number of colums.

```
@Override
public int getColumnCount() {
    return N_COLUMN;
}
```

* To get an specific value.

```
@Override
public Object getValueAt(int row_index, int column_index) {
    switch (column_index){
        case COLUMN_NAME:
            return this.tSocio_to_show.get(row_index).getName();
        case COLUMN_DNI:
            return this.tSocio_to_show.get(row_index).getDni();
        case COLUMN_PHONE:
            return this.tSocio_to_show.get(row_index).getPhone();
        case COLUMN_CATEGORY:
            return this.tSocio_to_show.get(row_index).getCategory();
        default:
            throw new IllegalArgumentException();
    }
}
```

* To set the column names.
```
@Override
public String getColumnName(int column) {
    switch (column){
        case COLUMN_NAME:
            return "Nombre y Apellido";
        case COLUMN_DNI:
            return "DNI";
        case COLUMN_PHONE:
            return "Telefono";
        case COLUMN_CATEGORY:
            return "Categoría";
        default:
            throw new IllegalArgumentException();
    }
}
```

### Finally

_We need a method to replace the standar table for our table._

```
public void showRegistros(ArrayList<TSocio> registros){
        RegisterTableModel modeloTableRegistros = new RegisterTableModel(registros);
        this.window.getTable().setModel(modeloTableRegistros);
        this.window.setRegistros(this.repository.getRegistrosList());
        this.window.setContador(registros.size());
}
 ```

## Results ⚙️

_This e.g. is a form to add and list a serie of *socios*._

![table](https://user-images.githubusercontent.com/40641262/97043256-8a79d180-1548-11eb-81a8-5ffcbb1abcd1.png)

_As you can see, at the botton is the table that we define before._

## Thanks 🎁

- That's it

- I hope this will help you 🤓

## Author ✒️

---

⌨️[IgnacioBrizuela](https://github.com/ignaciobrizuela)
