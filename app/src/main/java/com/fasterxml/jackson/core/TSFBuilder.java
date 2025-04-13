package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TSFBuilder;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.core.p006io.InputDecorator;
import com.fasterxml.jackson.core.p006io.OutputDecorator;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class TSFBuilder<F extends JsonFactory, B extends TSFBuilder<F, B>> {
    public int _factoryFeatures;
    public InputDecorator _inputDecorator;
    public OutputDecorator _outputDecorator;
    public int _streamReadFeatures;
    public int _streamWriteFeatures;
    public static final int DEFAULT_FACTORY_FEATURE_FLAGS = JsonFactory.Feature.collectDefaults();
    public static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    public static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();

    public TSFBuilder() {
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._streamReadFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._streamWriteFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._inputDecorator = null;
        this._outputDecorator = null;
    }

    private B _failNonJSON(Object obj) {
        StringBuilder m24u = C0000a.m24u("Feature ");
        m24u.append(obj.getClass().getName());
        m24u.append("#");
        m24u.append(obj.toString());
        m24u.append(" not supported for non-JSON backend");
        throw new IllegalArgumentException(m24u.toString());
    }

    public void _legacyDisable(JsonParser.Feature feature) {
        this._streamReadFeatures = (~feature.getMask()) & this._streamReadFeatures;
    }

    public void _legacyEnable(JsonParser.Feature feature) {
        this._streamReadFeatures = feature.getMask() | this._streamReadFeatures;
    }

    public final B _this() {
        return this;
    }

    public abstract F build();

    public B configure(JsonFactory.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public B disable(JsonFactory.Feature feature) {
        this._factoryFeatures = (~feature.getMask()) & this._factoryFeatures;
        return _this();
    }

    public B enable(JsonFactory.Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return _this();
    }

    public int factoryFeaturesMask() {
        return this._factoryFeatures;
    }

    public InputDecorator inputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator outputDecorator() {
        return this._outputDecorator;
    }

    public int streamReadFeatures() {
        return this._streamReadFeatures;
    }

    public int streamWriteFeatures() {
        return this._streamWriteFeatures;
    }

    public void _legacyDisable(JsonGenerator.Feature feature) {
        this._streamWriteFeatures = (~feature.getMask()) & this._streamWriteFeatures;
    }

    public void _legacyEnable(JsonGenerator.Feature feature) {
        this._streamWriteFeatures = feature.getMask() | this._streamWriteFeatures;
    }

    public B configure(StreamReadFeature streamReadFeature, boolean z) {
        return z ? enable(streamReadFeature) : disable(streamReadFeature);
    }

    public B inputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return _this();
    }

    public B outputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return _this();
    }

    public B configure(StreamWriteFeature streamWriteFeature, boolean z) {
        return z ? enable(streamWriteFeature) : disable(streamWriteFeature);
    }

    public B disable(StreamReadFeature streamReadFeature) {
        this._streamReadFeatures = (~streamReadFeature.mappedFeature().getMask()) & this._streamReadFeatures;
        return _this();
    }

    public B enable(StreamReadFeature streamReadFeature) {
        this._streamReadFeatures = streamReadFeature.mappedFeature().getMask() | this._streamReadFeatures;
        return _this();
    }

    public B configure(JsonReadFeature jsonReadFeature, boolean z) {
        return _failNonJSON(jsonReadFeature);
    }

    public B configure(JsonWriteFeature jsonWriteFeature, boolean z) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B disable(StreamReadFeature streamReadFeature, StreamReadFeature... streamReadFeatureArr) {
        this._streamReadFeatures = (~streamReadFeature.mappedFeature().getMask()) & this._streamReadFeatures;
        for (StreamReadFeature streamReadFeature2 : streamReadFeatureArr) {
            this._streamReadFeatures = (~streamReadFeature2.mappedFeature().getMask()) & this._streamReadFeatures;
        }
        return _this();
    }

    public B enable(StreamReadFeature streamReadFeature, StreamReadFeature... streamReadFeatureArr) {
        this._streamReadFeatures = streamReadFeature.mappedFeature().getMask() | this._streamReadFeatures;
        for (StreamReadFeature streamReadFeature2 : streamReadFeatureArr) {
            this._streamReadFeatures = streamReadFeature2.mappedFeature().getMask() | this._streamReadFeatures;
        }
        return _this();
    }

    public TSFBuilder(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
    }

    public TSFBuilder(int i2, int i3, int i4) {
        this._factoryFeatures = i2;
        this._streamReadFeatures = i3;
        this._streamWriteFeatures = i4;
    }

    public B disable(StreamWriteFeature streamWriteFeature) {
        this._streamWriteFeatures = (~streamWriteFeature.mappedFeature().getMask()) & this._streamWriteFeatures;
        return _this();
    }

    public B enable(StreamWriteFeature streamWriteFeature) {
        this._streamWriteFeatures = streamWriteFeature.mappedFeature().getMask() | this._streamWriteFeatures;
        return _this();
    }

    public B disable(StreamWriteFeature streamWriteFeature, StreamWriteFeature... streamWriteFeatureArr) {
        this._streamWriteFeatures = (~streamWriteFeature.mappedFeature().getMask()) & this._streamWriteFeatures;
        for (StreamWriteFeature streamWriteFeature2 : streamWriteFeatureArr) {
            this._streamWriteFeatures = (~streamWriteFeature2.mappedFeature().getMask()) & this._streamWriteFeatures;
        }
        return _this();
    }

    public B enable(StreamWriteFeature streamWriteFeature, StreamWriteFeature... streamWriteFeatureArr) {
        this._streamWriteFeatures = streamWriteFeature.mappedFeature().getMask() | this._streamWriteFeatures;
        for (StreamWriteFeature streamWriteFeature2 : streamWriteFeatureArr) {
            this._streamWriteFeatures = streamWriteFeature2.mappedFeature().getMask() | this._streamWriteFeatures;
        }
        return _this();
    }

    public B disable(JsonReadFeature jsonReadFeature) {
        return _failNonJSON(jsonReadFeature);
    }

    public B enable(JsonReadFeature jsonReadFeature) {
        return _failNonJSON(jsonReadFeature);
    }

    public B disable(JsonReadFeature jsonReadFeature, JsonReadFeature... jsonReadFeatureArr) {
        return _failNonJSON(jsonReadFeature);
    }

    public B enable(JsonReadFeature jsonReadFeature, JsonReadFeature... jsonReadFeatureArr) {
        return _failNonJSON(jsonReadFeature);
    }

    public B disable(JsonWriteFeature jsonWriteFeature) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B enable(JsonWriteFeature jsonWriteFeature) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B disable(JsonWriteFeature jsonWriteFeature, JsonWriteFeature... jsonWriteFeatureArr) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B enable(JsonWriteFeature jsonWriteFeature, JsonWriteFeature... jsonWriteFeatureArr) {
        return _failNonJSON(jsonWriteFeature);
    }
}
