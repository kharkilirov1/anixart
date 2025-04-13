package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.util.Collection;

/* loaded from: classes.dex */
public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> {
    private static final int DESER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(DeserializationFeature.class);
    private static final long serialVersionUID = 2;
    public final int _deserFeatures;
    public final int _formatReadFeatures;
    public final int _formatReadFeaturesToChange;
    public final JsonNodeFactory _nodeFactory;
    public final int _parserFeatures;
    public final int _parserFeaturesToChange;
    public final LinkedNode<DeserializationProblemHandler> _problemHandlers;

    public DeserializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = DESER_FEATURE_DEFAULTS;
        this._nodeFactory = JsonNodeFactory.instance;
        this._problemHandlers = null;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    private DeserializationConfig _withJsonReadFeatures(FormatFeature... formatFeatureArr) {
        JsonParser.Feature mappedFeature;
        int i2 = this._parserFeatures;
        int i3 = this._parserFeaturesToChange;
        int i4 = this._formatReadFeatures;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        int i8 = this._formatReadFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i7 |= mask;
            i8 |= mask;
            if ((formatFeature instanceof JsonReadFeature) && (mappedFeature = ((JsonReadFeature) formatFeature).mappedFeature()) != null) {
                int mask2 = mappedFeature.getMask();
                i6 = mask2 | i6;
                i5 |= mask2;
            }
        }
        return (this._formatReadFeatures == i7 && this._formatReadFeaturesToChange == i8 && this._parserFeatures == i5 && this._parserFeaturesToChange == i6) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i5, i6, i7, i8);
    }

    private DeserializationConfig _withoutJsonReadFeatures(FormatFeature... formatFeatureArr) {
        JsonParser.Feature mappedFeature;
        int i2 = this._parserFeatures;
        int i3 = this._parserFeaturesToChange;
        int i4 = this._formatReadFeatures;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        int i8 = this._formatReadFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i7 &= ~mask;
            i8 |= mask;
            if ((formatFeature instanceof JsonReadFeature) && (mappedFeature = ((JsonReadFeature) formatFeature).mappedFeature()) != null) {
                int mask2 = mappedFeature.getMask();
                i6 = mask2 | i6;
                i5 = (~mask2) & i5;
            }
        }
        return (this._formatReadFeatures == i7 && this._formatReadFeaturesToChange == i8 && this._parserFeatures == i5 && this._parserFeaturesToChange == i6) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i5, i6, i7, i8);
    }

    public TypeDeserializer findTypeDeserializer(JavaType javaType) throws JsonMappingException {
        AnnotatedClass classInfo = introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> findTypeResolver = getAnnotationIntrospector().findTypeResolver(this, classInfo, javaType);
        Collection<NamedType> collection = null;
        if (findTypeResolver == null) {
            findTypeResolver = getDefaultTyper(javaType);
            if (findTypeResolver == null) {
                return null;
            }
        } else {
            collection = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, classInfo);
        }
        return findTypeResolver.buildTypeDeserializer(this, javaType, collection);
    }

    public BaseSettings getBaseSettings() {
        return this._base;
    }

    public final int getDeserializationFeatures() {
        return this._deserFeatures;
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._nodeFactory;
    }

    public LinkedNode<DeserializationProblemHandler> getProblemHandlers() {
        return this._problemHandlers;
    }

    public final boolean hasDeserializationFeatures(int i2) {
        return (this._deserFeatures & i2) == i2;
    }

    public final boolean hasSomeOfFeatures(int i2) {
        return (i2 & this._deserFeatures) != 0;
    }

    public void initialize(JsonParser jsonParser) {
        int i2 = this._parserFeaturesToChange;
        if (i2 != 0) {
            jsonParser.overrideStdFeatures(this._parserFeatures, i2);
        }
        int i3 = this._formatReadFeaturesToChange;
        if (i3 != 0) {
            jsonParser.overrideFormatFeatures(this._formatReadFeatures, i3);
        }
    }

    public <T extends BeanDescription> T introspect(JavaType javaType) {
        return (T) getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public <T extends BeanDescription> T introspectForBuilder(JavaType javaType) {
        return (T) getClassIntrospector().forDeserializationWithBuilder(this, javaType, this);
    }

    public <T extends BeanDescription> T introspectForCreation(JavaType javaType) {
        return (T) getClassIntrospector().forCreation(this, javaType, this);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._deserFeatures) != 0;
    }

    public final boolean requiresFullValue() {
        return DeserializationFeature.FAIL_ON_TRAILING_TOKENS.enabledIn(this._deserFeatures);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        return this._rootName != null ? !r0.isEmpty() : isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    public DeserializationConfig withFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i2 = this._deserFeatures;
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            i2 |= deserializationFeature.getMask();
        }
        return i2 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i2, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withHandler(DeserializationProblemHandler deserializationProblemHandler) {
        return LinkedNode.contains(this._problemHandlers, deserializationProblemHandler) ? this : new DeserializationConfig(this, (LinkedNode<DeserializationProblemHandler>) new LinkedNode(deserializationProblemHandler, this._problemHandlers));
    }

    public DeserializationConfig withNoProblemHandlers() {
        return this._problemHandlers == null ? this : new DeserializationConfig(this, (LinkedNode<DeserializationProblemHandler>) null);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* bridge */ /* synthetic */ DeserializationConfig withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature) {
        int i2 = this._deserFeatures & (~deserializationFeature.getMask());
        return i2 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i2, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i2 = this._deserFeatures;
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            i2 &= ~deserializationFeature.getMask();
        }
        return i2 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i2, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new DeserializationConfig(this, baseSettings);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withMapperFeatures(int i2) {
        return new DeserializationConfig(this, i2, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public final boolean isEnabled(JsonParser.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._parserFeaturesToChange) != 0) {
            return (feature.getMask() & this._parserFeatures) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig withRootName(PropertyName propertyName) {
        if (propertyName == null) {
            if (this._rootName == null) {
                return this;
            }
        } else if (propertyName.equals(this._rootName)) {
            return this;
        }
        return new DeserializationConfig(this, propertyName);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new DeserializationConfig(this, cls);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig with(SubtypeResolver subtypeResolver) {
        return this._subtypeResolver == subtypeResolver ? this : new DeserializationConfig(this, subtypeResolver);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int i2 = (~deserializationFeature.getMask()) & this._deserFeatures;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            i2 &= ~deserializationFeature2.getMask();
        }
        return i2 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i2, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new DeserializationConfig(this, contextAttributes);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature) {
        int mask = this._deserFeatures | deserializationFeature.getMask();
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withFeatures(JsonParser.Feature... featureArr) {
        int i2 = this._parserFeatures;
        int i3 = i2;
        int i4 = this._parserFeaturesToChange;
        for (JsonParser.Feature feature : featureArr) {
            int mask = feature.getMask();
            i3 |= mask;
            i4 |= mask;
        }
        return (this._parserFeatures == i3 && this._parserFeaturesToChange == i4) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i3, i4, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(JsonParser.Feature... featureArr) {
        int i2 = this._parserFeatures;
        int i3 = i2;
        int i4 = this._parserFeaturesToChange;
        for (JsonParser.Feature feature : featureArr) {
            int mask = feature.getMask();
            i3 &= ~mask;
            i4 |= mask;
        }
        return (this._parserFeatures == i3 && this._parserFeaturesToChange == i4) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i3, i4, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int mask = deserializationFeature.getMask() | this._deserFeatures;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            mask |= deserializationFeature2.getMask();
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig without(JsonParser.Feature feature) {
        int i2 = this._parserFeatures & (~feature.getMask());
        int mask = this._parserFeaturesToChange | feature.getMask();
        return (this._parserFeatures == i2 && this._parserFeaturesToChange == mask) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i2, mask, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(deserializationConfig, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig withFeatures(FormatFeature... formatFeatureArr) {
        if (formatFeatureArr.length > 0 && (formatFeatureArr[0] instanceof JsonReadFeature)) {
            return _withJsonReadFeatures(formatFeatureArr);
        }
        int i2 = this._formatReadFeatures;
        int i3 = i2;
        int i4 = this._formatReadFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i3 |= mask;
            i4 |= mask;
        }
        return (this._formatReadFeatures == i3 && this._formatReadFeaturesToChange == i4) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i3, i4);
    }

    public DeserializationConfig without(FormatFeature formatFeature) {
        if (formatFeature instanceof JsonReadFeature) {
            return _withoutJsonReadFeatures(formatFeature);
        }
        int i2 = this._formatReadFeatures & (~formatFeature.getMask());
        int mask = this._formatReadFeaturesToChange | formatFeature.getMask();
        return (this._formatReadFeatures == i2 && this._formatReadFeaturesToChange == mask) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i2, mask);
    }

    public DeserializationConfig withoutFeatures(FormatFeature... formatFeatureArr) {
        if (formatFeatureArr.length > 0 && (formatFeatureArr[0] instanceof JsonReadFeature)) {
            return _withoutJsonReadFeatures(formatFeatureArr);
        }
        int i2 = this._formatReadFeatures;
        int i3 = i2;
        int i4 = this._formatReadFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i3 &= ~mask;
            i4 |= mask;
        }
        return (this._formatReadFeatures == i3 && this._formatReadFeaturesToChange == i4) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i3, i4);
    }

    public DeserializationConfig with(JsonParser.Feature feature) {
        int mask = this._parserFeatures | feature.getMask();
        int mask2 = this._parserFeaturesToChange | feature.getMask();
        return (this._parserFeatures == mask && this._parserFeaturesToChange == mask2) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, mask, mask2, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(FormatFeature formatFeature) {
        if (formatFeature instanceof JsonReadFeature) {
            return _withJsonReadFeatures(formatFeature);
        }
        int mask = this._formatReadFeatures | formatFeature.getMask();
        int mask2 = this._formatReadFeaturesToChange | formatFeature.getMask();
        return (this._formatReadFeatures == mask && this._formatReadFeaturesToChange == mask2) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, mask, mask2);
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(deserializationConfig, i2);
        this._deserFeatures = i3;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = i4;
        this._parserFeaturesToChange = i5;
        this._formatReadFeatures = i6;
        this._formatReadFeaturesToChange = i7;
    }

    public DeserializationConfig with(JsonNodeFactory jsonNodeFactory) {
        return this._nodeFactory == jsonNodeFactory ? this : new DeserializationConfig(this, jsonNodeFactory);
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, SubtypeResolver subtypeResolver) {
        super(deserializationConfig, subtypeResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, BaseSettings baseSettings) {
        super(deserializationConfig, baseSettings);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, JsonNodeFactory jsonNodeFactory) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = jsonNodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, LinkedNode<DeserializationProblemHandler> linkedNode) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = linkedNode;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, PropertyName propertyName) {
        super(deserializationConfig, propertyName);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, Class<?> cls) {
        super(deserializationConfig, cls);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, ContextAttributes contextAttributes) {
        super(deserializationConfig, contextAttributes);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(deserializationConfig, simpleMixInResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }
}
