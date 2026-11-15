import java.util.Scanner;

public class Nokia5510MenuMap {
	public static void main(String[] args) {
		
		Scanner inputChoice = new Scanner(System.in);
		
		
		String nokiaMainMenu = """
		
		NOKIA 5510 MAIN MENU
		------------------------------------------
		Get used to your phone using this Menu Map

		Press 1 for Phone Book
		Press 2 for Messages
		Press 3 for Chat
		Press 4 for Call register
		Press 5 for Tones
		Press 6 for Settings
		Press 7 for Call divert
		Press 8 for Music
		Press 9 for Games
		Press 10 for Calculator
		Press 11 for Reminders
		Press 12 for Clock
		Press 13 for Profiles
		Press 14 for Services
		Press 15 for SIM services
		Press 0 to Exit Menu Map
		
		""";
		
		System.out.println(nokiaMainMenu);
		
		
		System.out.print("Select an option: ");
		int nokiaMainMenuOption = inputChoice.nextInt();
		
		
		switch (nokiaMainMenuOption) {
			
			case 1 -> {
				
				String nokiaPhoneBook = """
				
					Phone book
					------------------------
					Press 1 for Search
					Press 2 for Service Nos.
					Press 3 for Add name
					Press 4 for Erase
					Press 5 for Edit
					Press 6 for Copy
					Press 7 for Assign tone
					Press 8 for Send b’card
					Press 9 for Options
					Press 10 for Speed dials
					Press 11 for Voice tags
				
					""";
					System.out.println(nokiaPhoneBook);
				
					System.out.print("Select an option: ");
					int nokiaPhoneBookOption = inputChoice.nextInt();
					
					switch (nokiaPhoneBookOption) {
						
						case 1 ->
							System.out.println("Search");
							
						case 2 ->
							System.out.println("Service Nos.");
						
						case 3 ->
							System.out.println("Add name");
						
						case 4 ->
							System.out.println("Erase");
							
						case 5 ->
							System.out.println("Edit");
							
						case 6 ->
							System.out.print("Copy");
							
						case 7 ->
							System.out.println("Assign tone");
							
						case 8 ->
							System.out.println("Send b’card");
							
						case 9 -> {
							String optionsMenu = """
				
					Phone book
					--------------------------
					Press 1 for Memory in use
					Press 2 for Type of view
					Press 3 for Memory status
				
					""";
					System.out.println(optionsMenu);
				
					System.out.print("Select an option: ");
					int optionsMenuOption = inputChoice.nextInt();
					
							switch (optionsMenuOption) {
								
								case 1 ->
									System.out.println("Memory in use");
							
								case 2 ->
									System.out.println("Type of view");
							
								case 3 ->
									System.out.println("Memory status"); 
								}
							}
					    case 10 ->
							System.out.println("Speed dials");
							
						  case 11 ->
							System.out.println("Voice tags");
					}		
			}
    		
			
			case 2 -> {
				
				String nokiaMessages = """
				
					Messages
					--------------------------
					Press 1 for Write messages
					Press 2 for Inbox
					Press 3 for Outbox
					Press 4 for Picture messages
					Press 5 for Templates
					Press 6 for Smileys
					Press 7 for Message settings
					Press 8 for Info service
					Press 9 for Voice mailbox number
					Press 10 for Service command editor
				
					""";
					System.out.println(nokiaMessages);
				
					System.out.print("Select an option: ");
					int nokiaMessagesOption = inputChoice.nextInt();
					
					switch (nokiaMessagesOption) {
						
						case 1 ->
							System.out.println("Write messages");
							
						case 2 ->
							System.out.println("Inbox");
						
						case 3 ->
							System.out.println("Outbox");
						
						case 4 ->
							System.out.println("Picture messages");
							
						case 5 ->
							System.out.println("Templates");
							
						case 6 ->
							System.out.print("Smileys");
							
					
					
					
					
						case 7 -> {
							String messageSettingsMenu = """
				
					Message settings
					--------------------------
					Press 1 for Set
					Press 2 for Common
				
					""";
					System.out.println(messageSettingsMenu);
				
					System.out.print("Select an option: ");
					int messageSettingsMenuOption = inputChoice.nextInt();
					
							switch (messageSettingsMenuOption) {
								
								case 1 -> {
								    
								    String messageSetMenu = """
				
					                Message settings Set
					                --------------------------
					                Press 1 for Message centre number
					                Press 2 for Messages sent as
					                Press 3 for Message validity
				
					                """;
					                System.out.println(messageSetMenu);
				
					                System.out.print("Select an option: ");
					                int messageSetMenuOption = inputChoice.nextInt();
					                
					                
					                switch (messageSetMenuOption) {
								
								        case 1 ->
									        System.out.println("Message centre number");
							
								        case 2 ->
									        System.out.println("Messages sent as");
							
								        case 3 ->
									        System.out.println("Message validity"); 
								    }
								}
							
							    case 2 -> {
								    
								    String messageCommonMenu = """
				
					                Message settings Common
					                --------------------------
					                Press 1 for Delivery reports
					                Press 2 for Reply via same centre
					                Press 3 for Character support
				
					                """;
					                System.out.println(messageCommonMenu);
				
					                System.out.print("Select an option: ");
					                int messageCommonMenuOption = inputChoice.nextInt();
					                
					                
					                switch (messageCommonMenuOption) {
								
								        case 1 ->
									        System.out.println("Delivery reports");
							
								        case 2 ->
									        System.out.println("Reply via same centre");
							
								        case 3 ->
									        System.out.println("Character support"); 
								    }
								}
							
							}								
								
						}							
							
						case 8 ->
							System.out.println("Info service");
							
						
					    case 9 ->
							System.out.println("Voice mailbox number");
							
				        case 10 ->
							System.out.println("Service command editor");
					}		
			    }
		
            case 3 ->
                System.out.println("Chats");
                
                
                
            case 4 -> {
				
				String callRegister = """
				
					Call Register
					--------------------------
					Press 1 for Missed calls
					Press 2 for Received calls
					Press 3 for Dialled numbers
					Press 4 for Erase recent call lists
					Press 5 for Show call duration
					Press 6 for Show call costs
					Press 7 for Call cost settings
					Press 8 for Prepaid credit
				
					""";
					System.out.println(callRegister);
				
					System.out.print("Select an option: ");
					int nokiaMessagesOption = inputChoice.nextInt();
					
					switch (nokiaMessagesOption) {
						
						case 1 ->
							System.out.println("Missed calls");
							
						case 2 ->
							System.out.println("Received calls");
						
						case 3 ->
							System.out.println("Dialled numbers");
						
						case 4 ->
							System.out.println("Erase recent call lists");
					
						case 5 -> {
							String callDurationMenu = """
				
					Show call duration
					--------------------------
					Press 1 for Last call duration
					Press 2 for All calls’ duration
					Press 3 for Received calls’ duration
					Press 4 for Dialled calls’ duration
					Press 5 for Clear timers
				
					""";
					System.out.println(callDurationMenu);
				
					System.out.print("Select an option: ");
					int callDurationMenuOption = inputChoice.nextInt();
					
							switch (callDurationMenuOption) {
								
								case 1 ->
									System.out.println("Last call duration");
							
								case 2 ->
									System.out.println("All calls’ duration");
							
								case 3 ->
									System.out.println("Received calls’ duration");
									
								case 4 ->
									System.out.println("Dialled calls’ duration");
							
								case 5 ->
									System.out.println("Clear timers");
							}								
								
						}	
						
						case 6 -> {
							String showCallCostsMenu = """
				
					Show call costs
					--------------------------
					Press 1 for Last call cost
					Press 2 for All calls’ cost
					Press 3 for Clear counters
				
					""";
					System.out.println(showCallCostsMenu);
				
					System.out.print("Select an option: ");
					int showCallCostsMenuOption = inputChoice.nextInt();
					
							switch (showCallCostsMenuOption) {
								
								case 1 ->
									System.out.println("Last call cost: N300");
							
								case 2 ->
									System.out.println("All calls’ cost: N2,000");
							
								case 3 ->
									System.out.println("Clear counters: 53");
							}								
								
						}
						
						case 7 -> {
							String callCostSetMenu = """
				
					Call cost settings
					---------------------------
					Press 1 for Call cost limit
					Press 2 for Show costs in
				
					""";
					System.out.println(callCostSetMenu);
				
					System.out.print("Select an option: ");
					int callCostSetMenuOption = inputChoice.nextInt();
					
							switch (callCostSetMenuOption) {
								
								case 1 ->
									System.out.println("Call cost limit");
							
								case 2 ->
									System.out.println("Show costs in");
							}								
								
						}
							
						case 8 ->
							System.out.println("Prepaid credit: N400,000");
							
					}		
			    }
		
		
		    
            case 5 -> {
				
				String nokiaTones = """
				
					Phone book
					--------------------------
					Press 1 for Ringing tone
					Press 2 for Ringing volume
					Press 3 for Incoming call alert
					Press 4 for Message alert tone
					Press 5 for Keypad tones
					Press 6 for Warning tones
					Press 7 for Vibrating alert
					Press 8 for Screen saver
				
					""";
					System.out.println(nokiaTones);
				
					System.out.print("Select an option: ");
					int nokiaTonesOption = inputChoice.nextInt();
					
					switch (nokiaTonesOption) {
						
						case 1 ->
							System.out.println("Ringing tone");
							
						case 2 ->
							System.out.println("Ringing volume");
						
						case 3 ->
							System.out.println("Incoming call alert");
						
						case 4 ->
							System.out.println("Message alert tone");
							
						case 5 ->
							System.out.println("Keypad tones");
							
						case 6 ->
							System.out.print("Warning tones");
							
						case 7 ->
							System.out.println("Vibrating alert");
							
						case 8 ->
							System.out.println("Screen saver");
							
					}		
			}
		
		
		
            case 6 -> {
				
				String nokiaSettings = """
				
					Settings
					--------------------------
					Press 1 for Call settings
					Press 2 for Phone settings
					Press 3 for Security settings
					Press 4 for Restore factory settings
				
					""";
					System.out.println(nokiaSettings);
				
					System.out.print("Select an option: ");
					int nokiaSettingsOption = inputChoice.nextInt();
					
					switch (nokiaSettingsOption) {

						case 1 -> {
							String callSettingsMenu = """
				
					Call Settings
					----------------------------
					Press 1 for Automatic redial
					Press 2 for Speed dialling
					Press 3 for Call waiting options
					Press 4 for Own number sending
					Press 5 for Phone line in use
					Press 6 for Automatic answer
				
					""";
					System.out.println(callSettingsMenu);
				
					System.out.print("Select an option: ");
					int callSettingsMenuOption = inputChoice.nextInt();
					
							switch (callSettingsMenuOption) {
								
								case 1 ->
									System.out.println("Automatic redial");
							
								case 2 ->
									System.out.println("Speed dialling");
							
								case 3 ->
									System.out.println("Call waiting options");
									
								case 4 ->
									System.out.println("Own number sending");
							
								case 5 ->
									System.out.println("Phone line in use");
									
								case 6 ->
									System.out.println("Automatic answer");
					                
								}
							
							    
							
							}	
							
					    case 2 -> {
							String phoneSettingsMenu = """
				
					            Phone Settings
					            ----------------------------
					            Press 1 for Language
					            Press 2 for Cell info display
					            Press 3 for Welcome note
					            Press 4 for Network selection
					            Press 5 for Confirm SIM service actions
				
					            """;
					    System.out.println(phoneSettingsMenu);
				
					    System.out.print("Select an option: ");
					    int phoneSettingsMenuOption = inputChoice.nextInt();
					
							switch (phoneSettingsMenuOption) {
								
								case 1 ->
									System.out.println("Language");
							
								case 2 ->
									System.out.println("Cell info display");
							
								case 3 ->
									System.out.println("Welcome note");
									
								case 4 ->
									System.out.println("Network selection");
							
								case 5 ->
									System.out.println("Confirm SIM service actions");
					                
								}	
								
						}
						
						case 3 -> {
							String securitySettingsMenu = """
				
					            Security Settings
					            ----------------------------
					            Press 1 for PIN code request
					            Press 2 for Call barring service
					            Press 3 for Fixed dialling
					            Press 4 for Closed user group
					            Press 5 for Security level
					            Press 6 for Change access codes
				
					            """;
					            System.out.println(securitySettingsMenu);
				
					        System.out.print("Select an option: ");
					        int securitySettingsMenuOption = inputChoice.nextInt();
					
							switch (securitySettingsMenuOption) {
								
								case 1 ->
									System.out.println("PIN code request");
							
								case 2 ->
									System.out.println("Call barring service");
							
								case 3 ->
									System.out.println("Fixed dialling");
									
								case 4 ->
									System.out.println("Closed user group");
							
								case 5 ->
									System.out.println("Security level");
					                
					            case 6 ->
									System.out.println("Change access codes");
								}	
								
						}
							
						case 4 ->
							System.out.println("Restore factory settings");
					}		
			    }
		
		
            case 7 ->
                System.out.println("Call divert");
		
		
		    case 8 -> {
				
				String nokiaMusic = """
				
					Music
					--------------------------
					Press 1 for Music player
					Press 2 for Radio
					Press 3 for Recorder
					Press 4 for Track list
				
					""";
					System.out.println(nokiaMusic);
				
					System.out.print("Select an option: ");
					int nokiaMusicOption = inputChoice.nextInt();
					
					switch (nokiaMusicOption) {
						
						case 1 ->
							System.out.println("Music player");
							
						case 2 ->
							System.out.println("Radio");
						
						case 3 ->
							System.out.println("Recorder");
						
						case 4 ->
							System.out.println("Track list");
							
					}		
			}
		
		    case 9 ->
                System.out.println("Games");
                
                
            case 10 ->
                System.out.println("Calculator");
                
            
            case 11 ->
                System.out.println("Reminders");
		
		
		    case 12 -> {
				
				String nokiaMusic = """
				
					Clock
					----------------------------------------
					Press 1 for Alarm clock
					Press 2 for Clock settings
					Press 3 for Date setting
					Press 4 for Stopwatch
					Press 4 for Countdown timer
					Press 4 for Auto update of date and time
				
					""";
					System.out.println(nokiaMusic);
				
					System.out.print("Select an option: ");
					int nokiaMusicOption = inputChoice.nextInt();
					
					switch (nokiaMusicOption) {
						
						case 1 ->
							System.out.println("Alarm clock");
							
						case 2 ->
							System.out.println("Clock settings");
						
						case 3 ->
							System.out.println("Date setting");
						
						case 4 ->
							System.out.println("Stopwatch");
							
						case 5 ->
							System.out.println("Countdown timer");
							
						case 6 ->
							System.out.println("Auto update of date and time");
							
					}		
			}
			
			case 13 ->
                System.out.println("Profiles");
                
                
            case 14 ->
                System.out.println("Services");
                
            
            case 15 ->
                System.out.println("SIM services");
		
		}
	}
}
