package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                size++;
            }
        }
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (this.items[i] != null && items[i].getName().equals(key)) {
                result[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean validate = index != -1;
        if (validate) {
            item.setId(items[index].getId());
            items[index] = item;
            return true;
        }
        return false;
    }

    public void delete(int id) {
        int index = indexOf(id);
        boolean validate = index != -1;
        if (validate) {
            items[index] = null;
            Item[] source = items;
            int startPos = index + 1;
            int distPos = index;
            int length = size - index - 1;
            System.arraycopy(source, startPos, source, distPos, length);
            items[size - 1] = null;
            size--;
        }
    }
}