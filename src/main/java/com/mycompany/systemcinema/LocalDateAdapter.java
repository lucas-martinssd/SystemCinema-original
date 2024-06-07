/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Lucas
 */

public class LocalDateAdapter extends TypeAdapter<LocalDate> {
    private static final DateTimeFormatter formato = DateTimeFormatter.ISO_LOCAL_DATE;

    @Override
    public void write(JsonWriter jsonWriter, LocalDate localDate) throws IOException {
        jsonWriter.value(localDate.format(formato));
    }

    @Override
    public LocalDate read(JsonReader jsonReader) throws IOException {
        return LocalDate.parse(jsonReader.nextString(), formato);
    }
}
