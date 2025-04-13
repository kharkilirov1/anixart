package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements ContextualSerializer {
    public final DateFormat _customFormat;
    public final AtomicReference<DateFormat> _reusedCustomFormat;
    public final Boolean _useTimestamp;

    public DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        this._reusedCustomFormat = dateFormat == null ? null : new AtomicReference<>();
    }

    public void _acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, boolean z) throws JsonMappingException {
        if (z) {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
        } else {
            visitStringFormat(jsonFormatVisitorWrapper, javaType, JsonValueFormat.DATE_TIME);
        }
    }

    public boolean _asTimestamp(SerializerProvider serializerProvider) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (serializerProvider != null) {
            return serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        StringBuilder m24u = C0000a.m24u("Null SerializerProvider passed for ");
        m24u.append(handledType().getName());
        throw new IllegalArgumentException(m24u.toString());
    }

    public void _serializeAsString(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._customFormat == null) {
            serializerProvider.defaultSerializeDateValue(date, jsonGenerator);
            return;
        }
        DateFormat andSet = this._reusedCustomFormat.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this._customFormat.clone();
        }
        jsonGenerator.writeString(andSet.format(date));
        this._reusedCustomFormat.compareAndSet(null, andSet);
    }

    public abstract long _timestamp(T t);

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        _acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType, _asTimestamp(jsonFormatVisitorWrapper.getProvider()));
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides == null) {
            return this;
        }
        JsonFormat.Shape shape = findFormatOverrides.getShape();
        if (shape.isNumeric()) {
            return withFormat2(Boolean.TRUE, null);
        }
        if (findFormatOverrides.hasPattern()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(findFormatOverrides.getPattern(), findFormatOverrides.hasLocale() ? findFormatOverrides.getLocale() : serializerProvider.getLocale());
            simpleDateFormat.setTimeZone(findFormatOverrides.hasTimeZone() ? findFormatOverrides.getTimeZone() : serializerProvider.getTimeZone());
            return withFormat2(Boolean.FALSE, simpleDateFormat);
        }
        boolean hasLocale = findFormatOverrides.hasLocale();
        boolean hasTimeZone = findFormatOverrides.hasTimeZone();
        boolean z = shape == JsonFormat.Shape.STRING;
        if (!hasLocale && !hasTimeZone && !z) {
            return this;
        }
        DateFormat dateFormat = serializerProvider.getConfig().getDateFormat();
        if (dateFormat instanceof StdDateFormat) {
            StdDateFormat stdDateFormat = (StdDateFormat) dateFormat;
            if (findFormatOverrides.hasLocale()) {
                stdDateFormat = stdDateFormat.withLocale(findFormatOverrides.getLocale());
            }
            if (findFormatOverrides.hasTimeZone()) {
                stdDateFormat = stdDateFormat.withTimeZone(findFormatOverrides.getTimeZone());
            }
            return withFormat2(Boolean.FALSE, stdDateFormat);
        }
        if (!(dateFormat instanceof SimpleDateFormat)) {
            serializerProvider.reportBadDefinition((Class<?>) handledType(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", dateFormat.getClass().getName()));
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
        SimpleDateFormat simpleDateFormat3 = hasLocale ? new SimpleDateFormat(simpleDateFormat2.toPattern(), findFormatOverrides.getLocale()) : (SimpleDateFormat) simpleDateFormat2.clone();
        TimeZone timeZone = findFormatOverrides.getTimeZone();
        if ((timeZone == null || timeZone.equals(simpleDateFormat3.getTimeZone())) ? false : true) {
            simpleDateFormat3.setTimeZone(timeZone);
        }
        return withFormat2(Boolean.FALSE, simpleDateFormat3);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode(_asTimestamp(serializerProvider) ? "number" : "string", true);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public abstract void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;

    /* renamed from: withFormat */
    public abstract DateTimeSerializerBase<T> withFormat2(Boolean bool, DateFormat dateFormat);
}
