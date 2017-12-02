package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Aquatic extends Animal{
	private int avgSwimDepth;
	private WaterType waterType;
	
	Aquatic(){}
	
	Aquatic(int avgSwimDepth, WaterType waterType, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setAverageSwimDepth(avgSwimDepth);
		this.waterType = waterType;
	}
	
	private void setAverageSwimDepth(int avgSwimDepth) {
		if(avgSwimDepth > 0)
			this.avgSwimDepth = avgSwimDepth;
	}
	
	public int getAverageSwimDepth() {
		return avgSwimDepth;
	}
	
	public WaterType getWaterType() {
		return waterType;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"avgSwimDepth",String.valueOf(avgSwimDepth));
		createNode(eventWriter,"waterType",waterType.toString());
	}
	
	@Override
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setAverageSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		if(element.getElementsByTagName("waterType").item(0).getTextContent().equals(WaterType.Salt.toString()))
			waterType = WaterType.Salt;
		else
			waterType = WaterType.Fresh;
	}
}
