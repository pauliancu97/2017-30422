package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Bird extends Animal{
	private boolean migrates;
	private int avgFlightAltitude;
	
	Bird(){}
	
	Bird(boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.migrates = migrates;
		setAverageFlightAltitude(avgFlightAltitude);
	}
	
	private void setAverageFlightAltitude(int avgFlightAltitude) {
		if(avgFlightAltitude > 0)
			this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	
	public boolean getMigrates() {
		return migrates;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"migrates",String.valueOf(migrates));
		createNode(eventWriter,"avgFlightAltitude",String.valueOf(avgFlightAltitude));
	}
	
	@Override
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setAverageFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
		if(element.getElementsByTagName("migrates").item(0).getTextContent().equals("true"))
			migrates = true;
		else
			migrates = false;
	}
}
