package com.reprezen.kaizen.oasparser.model3;

import java.util.Map;

import javax.annotation.Generated;

import com.reprezen.jsonoverlay.IJsonOverlay;
import com.reprezen.jsonoverlay.IModelPart;

public interface MediaType extends IJsonOverlay<MediaType>, IModelPart<OpenApi3, MediaType> {

	// Schema
	@Generated("com.reprezen.gen.CodeGenerator")
	Schema getSchema();

	@Generated("com.reprezen.gen.CodeGenerator")
	Schema getSchema(boolean elaborate);

	@Generated("com.reprezen.gen.CodeGenerator")
	void setSchema(Schema schema);

	// Example
	@Generated("com.reprezen.gen.CodeGenerator")
	Map<String, Example> getExamples();

	@Generated("com.reprezen.gen.CodeGenerator")
	Map<String, Example> getExamples(boolean elaborate);

	@Generated("com.reprezen.gen.CodeGenerator")
	boolean hasExample(String name);

	@Generated("com.reprezen.gen.CodeGenerator")
	Example getExample(String name);

	@Generated("com.reprezen.gen.CodeGenerator")
	void setExamples(Map<String, Example> examples);

	@Generated("com.reprezen.gen.CodeGenerator")
	void setExample(String name, Example example);

	@Generated("com.reprezen.gen.CodeGenerator")
	void removeExample(String name);

	// Example
	@Generated("com.reprezen.gen.CodeGenerator")
	Object getExample();

	@Generated("com.reprezen.gen.CodeGenerator")
	Object getExample(boolean elaborate);

	@Generated("com.reprezen.gen.CodeGenerator")
	void setExample(Object example);

	// EncodingProperty
	@Generated("com.reprezen.gen.CodeGenerator")
	Map<String, EncodingProperty> getEncodingProperties();

	@Generated("com.reprezen.gen.CodeGenerator")
	Map<String, EncodingProperty> getEncodingProperties(boolean elaborate);

	@Generated("com.reprezen.gen.CodeGenerator")
	boolean hasEncodingProperty(String name);

	@Generated("com.reprezen.gen.CodeGenerator")
	EncodingProperty getEncodingProperty(String name);

	@Generated("com.reprezen.gen.CodeGenerator")
	void setEncodingProperties(Map<String, EncodingProperty> encodingProperties);

	@Generated("com.reprezen.gen.CodeGenerator")
	void setEncodingProperty(String name, EncodingProperty encodingProperty);

	@Generated("com.reprezen.gen.CodeGenerator")
	void removeEncodingProperty(String name);

	// Extension
	@Generated("com.reprezen.gen.CodeGenerator")
	Map<String, Object> getExtensions();

	@Generated("com.reprezen.gen.CodeGenerator")
	Map<String, Object> getExtensions(boolean elaborate);

	@Generated("com.reprezen.gen.CodeGenerator")
	boolean hasExtension(String name);

	@Generated("com.reprezen.gen.CodeGenerator")
	Object getExtension(String name);

	@Generated("com.reprezen.gen.CodeGenerator")
	void setExtensions(Map<String, Object> extensions);

	@Generated("com.reprezen.gen.CodeGenerator")
	void setExtension(String name, Object extension);

	@Generated("com.reprezen.gen.CodeGenerator")
	void removeExtension(String name);
}
