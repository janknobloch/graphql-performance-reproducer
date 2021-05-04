
package org.acme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "cssLinkpulse",
    "channel",
    "path",
    "url",
    "cssActive",
    "children"
})
@Generated("jsonschema2pojo")
public class Navigation {

    @JsonProperty("name")
    private String name;
    @JsonProperty("css")
    private String css;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("path")
    private String path;
    @JsonProperty("url")
    private String url;
    @JsonProperty("cssActive")
    private Boolean cssActive;
    @JsonProperty("children")
    private List<Child> children = null;
  
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("css")
    public String getCss() {
        return css;
    }

    @JsonProperty("css")
    public void setCss(String css) {
        this.css = css;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("cssActive")
    public Boolean getCssActive() {
        return cssActive;
    }

    @JsonProperty("cssActive")
    public void setCssActive(Boolean cssActive) {
        this.cssActive = cssActive;
    }

    @JsonProperty("children")
    public List<Child> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<Child> children) {
        this.children = children;
    }

   

}
